package com.javathon.team.JavaThon.controllers;

import com.javathon.team.JavaThon.entities.Hackathon;
import com.javathon.team.JavaThon.entities.Team;
import com.javathon.team.JavaThon.services.HackathonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api")
@RestController
public class HackathonController {
    @Autowired
    private HackathonService hackathonService;

    @RequestMapping(value = "/hackathons", method = RequestMethod.GET)
    public List<Hackathon> getHackathons() {
        return hackathonService.getAll();
    }

    @RequestMapping(value = "/hackathons/{id}", method = RequestMethod.GET)
    public Hackathon getHackathonById(@PathVariable Long id) {
        return hackathonService.getHackathon(id);
    }


    @RequestMapping(value = "/hackathons", method = RequestMethod.POST)
    public void addHackathon(@RequestBody Hackathon hackathon) {
        hackathonService.addHackathon(hackathon);
        ;
    }

    @RequestMapping(value = "/hackathons", method = RequestMethod.PUT)
    public void updateHackathon(@RequestBody Hackathon hackathon) {
        hackathonService.updateHackathon(hackathon);
    }

    @RequestMapping(value = "/hackathons/{id}", method = RequestMethod.DELETE)
    public void deleteHackathon(@PathVariable Long id) {
        hackathonService.deleteHackathon(id);
    }

    @RequestMapping(value = "/hackathons/{id}/teams", method = RequestMethod.GET)
    public List<Team> getTeams(@PathVariable Long hackathonId) {
        return hackathonService.getTeamsForHackathon(hackathonId);
    }

    @RequestMapping(value = "/hackathons/{id}/teams", method = RequestMethod.POST)
    public void addTeam(@PathVariable Long hackathonId, @RequestBody Team team) {
        hackathonService.addTeamForHackathon(team);
    }

    @RequestMapping(value = "/hackathons/{id}/teams", method = RequestMethod.PUT)
    public void updateTeam(@PathVariable Long hackathonId, @RequestBody Team team) {
        hackathonService.updateTeamForHackathon(team);
    }

    @RequestMapping(value = "/hackathons/{hackathonId}/teams/{teamId}", method = RequestMethod.GET)
    public Team getTeam(@PathVariable Long hackathonId, @PathVariable Long teamId) {
        for(Team team: hackathonService.getTeamsForHackathon(hackathonId)) {
            if (team.getId() == teamId) {
                return team;
            }
        }
        return null;
    }
}
