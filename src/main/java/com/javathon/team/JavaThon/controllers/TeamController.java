package com.javathon.team.JavaThon.controllers;

import com.javathon.team.JavaThon.entities.Team;
import com.javathon.team.JavaThon.services.HackathonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/hackathon/{id}")
@RestController
public class TeamController {
    @Autowired
    private TeamService teamService;
    @Autowired
    private HackathonService hackathonService;

    @RequestMapping(value = "/teams", method = RequestMethod.GET)
    public List<Team> getTeams(@PathVariable Long hackathonId) {
        return teamService.getForHackathon(hackathonId);
    }

    @RequestMapping(value = "/teams", method = RequestMethod.GET)
    public void addTeam(@PathVariable Long hackathonId, @RequestBody Team team) {
        hackathonService.addTeamForHackathon(team);
    }
}
