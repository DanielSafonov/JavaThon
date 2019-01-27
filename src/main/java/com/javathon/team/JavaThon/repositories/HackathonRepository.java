package com.javathon.team.JavaThon.repositories;

import com.javathon.team.JavaThon.entities.Hackathon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;


public interface HackathonRepository extends JpaRepository<Hackathon, Long> {

}
