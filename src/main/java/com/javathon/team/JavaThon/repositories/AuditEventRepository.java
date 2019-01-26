package com.javathon.team.JavaThon.repositories;

import com.javathon.team.JavaThon.entities.AuditEvent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuditEventRepository extends JpaRepository<AuditEvent, Long> {
}
