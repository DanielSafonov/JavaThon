package com.javathon.team.JavaThon.repositories;

import com.javathon.team.JavaThon.entities.Participant;
import org.springframework.data.repository.CrudRepository;

public interface ParticipantsRepository extends CrudRepository<Participant, Long> {
}
