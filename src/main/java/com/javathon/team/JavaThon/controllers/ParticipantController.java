package com.javathon.team.JavaThon.controllers;

import com.javathon.team.JavaThon.entities.Participant;
import com.javathon.team.JavaThon.repositories.ParticipantRepository;
import com.javathon.team.JavaThon.services.ParticipantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api")
@RestController
public class ParticipantController {

    @Autowired
    private ParticipantService participantService;

    @RequestMapping(value = "/participant", method = RequestMethod.GET)
    public List<Participant> getParticipantsInTeam(@RequestParam Long id) {
        return participantService.getParticipantsInTeam(id);
    }

    @RequestMapping(value = "/participant", method = RequestMethod.POST)
    public void addParticipant(@RequestBody Participant participant) {
        participantService.addParticipant(participant);
        ;
    }
    @RequestMapping(value = "/participant", method = RequestMethod.DELETE)
    public void deleteParticipant(@RequestParam Long id) {
        participantService.deleteParticipant(id);
    }
}
