package com.javathon.team.JavaThon.repositories;

import com.javathon.team.JavaThon.entities.Participant;
import com.javathon.team.JavaThon.entities.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ParticipantRepository extends CrudRepository<Participant, Long> {
    public List<Participant> findAllByTeamId(Long teamId);

}
