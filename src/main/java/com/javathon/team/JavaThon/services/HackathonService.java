package com.javathon.team.JavaThon.services;

import com.javathon.team.JavaThon.entities.Hackathon;
import com.javathon.team.JavaThon.entities.Team;
import com.javathon.team.JavaThon.repositories.HackathonRepository;
import com.javathon.team.JavaThon.repositories.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HackathonService {
    @Autowired
    private HackathonRepository hackathonRepository;
    @Autowired
    private TeamRepository teamRepository;


    public List<Hackathon> getAll() {
        List<Hackathon> hackathons = new ArrayList<>();
        hackathonRepository.findAll().forEach(hackathons::add);
        return hackathons;
    }

    public void addHackathon(Hackathon hackathon) {
        hackathonRepository.save(hackathon);
    }

    public void updateHackathon(Hackathon hackathon) {
        hackathonRepository.save(hackathon);
    }

    public Hackathon getHackathon(Long id) {
        if(hackathonRepository.findById(id).isPresent()) {
            return hackathonRepository.findById(id).get();
        } else {
            return null;
        }
    }

    public void deleteHackathon(Long id) {
        hackathonRepository.deleteById(id);
    }

    public List<Team> getTeamsForHackathon(Long hackathonId) {
        List<Team> teams = new ArrayList<>();
        teamRepository.findAllByHackathonId(hackathonId).forEach(teams::add);
        return teams;
    }

    public void addTeamForHackathon(Team team) {
        teamRepository.save(team);
    }

    public void updateTeamForHackathon(Team team) {
        teamRepository.save(team);
    }

}
