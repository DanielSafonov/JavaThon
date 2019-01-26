package com.javathon.team.JavaThon.repositories;

import com.javathon.team.JavaThon.entities.Hackathon;
import org.springframework.data.repository.CrudRepository;

public interface HackathonsRepository extends CrudRepository<Hackathon, Long> {
}
