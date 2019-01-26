package com.javathon.team.JavaThon.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "audit_event_data")
@Data
@NoArgsConstructor
public class AuditEventData {

    @Id
    private Long id;

    @Column(name = "audit_event_id")
    private Long auditEventId;

    private String key;

    private String value;

}
