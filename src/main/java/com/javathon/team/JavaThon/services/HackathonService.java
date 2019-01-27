package com.javathon.team.JavaThon.services;

import com.javathon.team.JavaThon.entities.Hackathon;
import com.javathon.team.JavaThon.entities.Team;
import com.javathon.team.JavaThon.repositories.HackathonRepository;
import com.javathon.team.JavaThon.repositories.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HackathonService {
    @Autowired
    private HackathonRepository hackathonRepository;
    @Autowired
    private TeamRepository teamRepository;


    public List<Hackathon> getHackathons() {
        return hackathonRepository.findAll();
    }

    public void addHackathon(Hackathon hackathon) {
        hackathonRepository.save(hackathon);
    }

    public void updateHackathon(Hackathon hackathon) {
        hackathonRepository.save(hackathon);
    }

    public Hackathon getHackathon(Long id) {
        return hackathonRepository.findById(id).isPresent() ? hackathonRepository.findById(id).get(): null;
    }

    public void deleteHackathon(Long id) {
        hackathonRepository.deleteById(id);
    }


    public List<Team> getTeamsForHackathon(Long hackathonId) {
        return teamRepository.findAllByHackathonId(hackathonId);
    }

    public void addTeamForHackathon(Team team) {
        teamRepository.save(team);
    }

    public void updateTeamForHackathon(Team team) {
        teamRepository.save(team);
    }

}
