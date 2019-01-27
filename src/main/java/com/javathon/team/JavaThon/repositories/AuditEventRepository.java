package com.javathon.team.JavaThon.repositories;

import com.javathon.team.JavaThon.entities.AuditEvent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

@Repository
public interface AuditEventRepository extends JpaRepository<AuditEvent, Long> {

    @Query(value = "insert into javathon_schema.audit_event (user_id) values (:user_id_) returning id",
            nativeQuery = true)
    Long insertAuditEvent(@Param("user_id_") Long userId);

}
