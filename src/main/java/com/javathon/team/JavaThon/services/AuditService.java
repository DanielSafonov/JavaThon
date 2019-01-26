package com.javathon.team.JavaThon.services;

import lombok.Data;
import org.springframework.stereotype.Service;

import java.lang.reflect.Field;
import java.util.List;

@Service
@Data
public class AuditService<T> {

    public AuditService() {

    }

    public void createAudit(T target) {

//        List[] fields = target.getClass().getDeclaredFields();


    }

}
