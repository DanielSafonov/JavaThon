package com.javathon.team.JavaThon.repositories;

import com.javathon.team.JavaThon.entities.Team;
import org.springframework.data.repository.CrudRepository;

import java.awt.print.Pageable;
import java.util.List;

public interface TeamRepository  extends CrudRepository<Team, Long> {
    public List<Team> findAllByHackathonId(Long id);

}
