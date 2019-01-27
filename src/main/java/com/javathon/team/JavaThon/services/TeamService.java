package com.javathon.team.JavaThon.services;

import com.javathon.team.JavaThon.entities.Participant;
import com.javathon.team.JavaThon.entities.Team;
import com.javathon.team.JavaThon.entities.User;
import com.javathon.team.JavaThon.repositories.HackathonRepository;
import com.javathon.team.JavaThon.repositories.ParticipantRepository;
import com.javathon.team.JavaThon.repositories.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeamService {
    @Autowired
    private HackathonRepository hackathonRepository;
    @Autowired
    private TeamRepository teamRepository;
    @Autowired
    private ParticipantRepository participantRepository;

    public Team getTeam(Long teamId) {
        return teamRepository.findById(teamId).isPresent() ? teamRepository.findById(teamId).get() : null;
    }

    public void deleteTeam(Long teamId) {
        teamRepository.deleteById(teamId);
    }

    public void createTeam(Team team, String founderId) {
        teamRepository.save(team);
        Participant participant = new Participant();
        participant.setTeam(team);
        User founder = new User();
        founder.setPhoneNumber(founderId);
        participant.setUser(founder);
        participantRepository.save(participant);
    }

    public void addUserToTeam(String userId, Long teamId) {
        if (teamRepository.findById(teamId).isPresent()) {
            Team team = teamRepository.findById(teamId).get();
            if (getTeamLimit(team) < getParticipantCount(team)) {
                Participant participant = new Participant();
                User user = new User();
                user.setPhoneNumber(userId);
                participant.setUser(user);
                participant.setTeam(team);
                participantRepository.save(participant);
            }
        }
    }


    private Integer getTeamLimit(Team t) {
        if (hackathonRepository.findById(t.getHackathonId()).isPresent()) {
            return hackathonRepository.findById(t.getHackathonId()).get().getParticipantsLimit();
        } else {
            return null;
        }
    }

    private Integer getParticipantCount(Team t) {
        return participantRepository.findAllByTeamId(t.getId()).size();
    }
}
