package com.javathon.team.JavaThon.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "audit_event", schema = "javathon_schema")
@Data
@NoArgsConstructor
public class AuditEvent {

    public AuditEvent(Long userId) {
        this.userId = userId;
    }

    @Id
    private Long id;

    @Column(name = "user_id")
    private Long userId;

}
