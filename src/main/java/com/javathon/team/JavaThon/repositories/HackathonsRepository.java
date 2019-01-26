package com.javathon.team.JavaThon.repositories;

import com.javathon.team.JavaThon.entities.Hackathons;
import org.springframework.data.repository.CrudRepository;

public interface HackathonsRepository extends CrudRepository<Hackathons, Long> {
}
