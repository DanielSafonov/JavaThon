package com.javathon.team.JavaThon.services;

import com.javathon.team.JavaThon.entities.History;
import com.javathon.team.JavaThon.repositories.AuditEventDataRepository;
import com.javathon.team.JavaThon.repositories.AuditEventRepository;
import lombok.Data;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Data
public class AuditService<T> {

    private AuditEventRepository auditEventRepository;
    private AuditEventDataRepository auditEventDataRepository;

    public AuditService(AuditEventRepository auditEventRepository,
                        AuditEventDataRepository auditEventDataRepository) {
        this.auditEventDataRepository = auditEventDataRepository;
        this.auditEventRepository = auditEventRepository;
    }

    /**
     * Creates audit event by received entity
     * @param target
     */
    @Transactional
    public void createAudit(T target) {

        List<Field> fields = Arrays.asList(target.getClass().getDeclaredFields());
//        AuditEvent auditEvents = new AuditEvent();
//        Object tempAuditEventId = fields.stream()//Find id for tempAuditEventId
//                .filter(field -> "id".equals(field.getName()))
//                .map(field -> {
//                    try {
//                        field.setAccessible(true);
//                        return Long.valueOf(field.get(target).toString());
//                    } catch (IllegalAccessException e) {
//                        e.printStackTrace();
//                    }
//                    return null;
//                });
//        if(null != tempAuditEventId)
//            auditEvents.setId(Long.valueOf(tempAuditEventId.toString()));
//        Long realAuditEventId = auditEventRepository.insertAuditEvent(Long.valueOf(tempAuditEventId.toString()));
        List<History> auditEventData = fields.stream() //Convert target entity to 'audit event data'
                .map(field -> {
                    try {
                        field.setAccessible(true);
                        String name = field.getName();
                        String value = field.get(target).toString();
                        return new History(name, value);
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                    return null;
                }).collect(Collectors.toList());
            auditEventDataRepository.saveAll(auditEventData);
//        Long realAuditEventId = auditEventRepository.insertAuditEvent(Long.valueOf(tempAuditEventId.toString()));
    }

}
