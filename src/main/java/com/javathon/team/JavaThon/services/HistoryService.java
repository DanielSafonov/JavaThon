package com.javathon.team.JavaThon.services;

import com.javathon.team.JavaThon.entities.History;
import com.javathon.team.JavaThon.repositories.HistoryRepository;
import lombok.Data;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Data
public class HistoryService<T> {

    private HistoryRepository historyRepository;

    public HistoryService(HistoryRepository historyRepository) {
        this.historyRepository = historyRepository;
    }

    /**
     * Creates audit event by received entity
     * @param target
     */
    @Transactional
    public void createAudit(T target) {

        List<Field> fields = Arrays.asList(target.getClass().getDeclaredFields());
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
            historyRepository.saveAll(auditEventData);
    }

}
