package com.javathon.team.JavaThon.controllers;

import com.javathon.team.JavaThon.entities.Hackathon;
import com.javathon.team.JavaThon.entities.Team;
import com.javathon.team.JavaThon.services.HackathonService;
import com.javathon.team.JavaThon.services.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api")
@RestController
public class HackathonController {
    @Autowired
    private HackathonService hackathonService;
    @Autowired
    private TeamService teamService;

    @RequestMapping(value = "/hackathons", method = RequestMethod.GET)
    public List<Hackathon> getHackathons() {
        return hackathonService.getHackathons();
    }

    @RequestMapping(value = "/hackathons/{hackathonId}", method = RequestMethod.GET)
    public Hackathon getHackathonById(@PathVariable Long hackathonId) {
        return hackathonService.getHackathon(hackathonId);
    }

    @RequestMapping(value = "/hackathons", method = RequestMethod.POST)
    public void addHackathon(@RequestBody Hackathon hackathon) {
        hackathonService.addHackathon(hackathon);
    }

    @RequestMapping(value = "/hackathons", method = RequestMethod.PUT)
    public void updateHackathon(@RequestBody Hackathon hackathon) {
        hackathonService.updateHackathon(hackathon);
    }

    @RequestMapping(value = "/hackathons/{hackathonId}", method = RequestMethod.DELETE)
    public void deleteHackathon(@PathVariable Long hackathonId) {
        hackathonService.deleteHackathon(hackathonId);
    }

    @RequestMapping(value = "/hackathons/{hackathonId}/teams", method = RequestMethod.GET)
    public List<Team> getTeams(@PathVariable Long hackathonId) {
        return hackathonService.getTeamsForHackathon(hackathonId);
    }

    @RequestMapping(value = "/hackathons/{id}/teams", method = RequestMethod.PUT)
    public void updateTeam(@PathVariable Long hackathonId, @RequestBody Team team) {
        hackathonService.updateTeamForHackathon(team);
    }

    @RequestMapping(value = "/hackathons/{hackathonId}/teams/{teamId}", method = RequestMethod.GET)
    public Team getTeam(@PathVariable Long hackathonId, @PathVariable Long teamId) {
        return teamService.getTeam(teamId);
    }

    @RequestMapping(value = "/hackathons/{hackathonId}/teams/{teamId}", method = RequestMethod.DELETE)
    public void deleteTeam(@PathVariable Long hackathonId, @PathVariable Long teamId) {
        teamService.deleteTeam(teamId);
    }

    @RequestMapping(value = "/hackathons/{hackathonId}/teams", method = RequestMethod.POST)
    public void createTeam(@PathVariable Long hackathonId, @RequestBody Team team, @RequestParam String userId) {
        teamService.createTeam(team, userId);
    }

    @RequestMapping(value = "/hackathons/{hackathonId}/teams/{teamId}", method = RequestMethod.PUT)
    public void addUserToTeam(@PathVariable Long hackathonId, @RequestParam String userId, @PathVariable Long teamId) {
        teamService.addUserToTeam(userId, teamId);
    }
}
