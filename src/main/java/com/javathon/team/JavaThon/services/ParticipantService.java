package com.javathon.team.JavaThon.services;

import com.javathon.team.JavaThon.entities.Participant;
import com.javathon.team.JavaThon.entities.User;
import com.javathon.team.JavaThon.repositories.ParticipantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class ParticipantService {

    @Autowired
    private ParticipantRepository participantRepository;

    public List<Participant> getParticipantsInTeam(Long teamId) {
        List<Participant> participants = new ArrayList<>();
        participantRepository.findAllByTeamId(teamId).forEach(participants::add);
        return participants;
    }

    public void addParticipant(Participant hackathon) {
        participantRepository.save(hackathon);
    }


    public void deleteParticipant(Long id) {
        participantRepository.deleteById(id);
    }

}