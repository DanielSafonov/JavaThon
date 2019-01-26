package com.javathon.team.JavaThon.repositories;

import com.javathon.team.JavaThon.entities.Team;
import org.springframework.data.repository.CrudRepository;

public interface TeamRepository  extends CrudRepository<Team, Long> {
}
