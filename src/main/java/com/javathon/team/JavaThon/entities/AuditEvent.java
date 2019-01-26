package com.javathon.team.JavaThon.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "audit_event", schema = "javathon_schema")
@Data
@NoArgsConstructor
public class AuditEvent {

    @Id
    private Long id;

    @Column(name = "user_id")
    private Long userId;

}
