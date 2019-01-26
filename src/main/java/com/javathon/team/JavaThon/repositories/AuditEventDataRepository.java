package com.javathon.team.JavaThon.repositories;

import com.javathon.team.JavaThon.entities.AuditEventData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuditEventDataRepository extends JpaRepository<AuditEventData, Long> {
}
