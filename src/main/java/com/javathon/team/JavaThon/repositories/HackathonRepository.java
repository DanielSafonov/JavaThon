package com.javathon.team.JavaThon.repositories;

import com.javathon.team.JavaThon.entities.Hackathon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.awt.print.Pageable;
import java.util.List;

public interface HackathonRepository extends JpaRepository<Hackathon, Long> {

    List<Hackathon> getAllById(Pageable pageable);

}
