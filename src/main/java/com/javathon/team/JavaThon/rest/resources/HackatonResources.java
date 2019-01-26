package com.javathon.team.JavaThon.rest.resources;

import com.javathon.team.JavaThon.dto.RequestDTO;
import com.javathon.team.JavaThon.services.HackatoneService;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/hackathon")
public class HackatonResources {

    public HackatonResources(HackatoneService hackatoneService) {
        this.hackatoneService = hackatoneService;
    }

    private HackatoneService hackatoneService;

    @GetMapping
    public ResponseEntity getHackathones() {

        return ResponseEntity.ok(hackatoneService.getAll());
    }

    @PostMapping
    public ResponseEntity getHackatonPage(@RequestBody RequestDTO rq) {
        return ResponseEntity
                .ok(this.hackatoneService.getPage(PageRequest.of(rq.getPageable().getPage(), rq.getPageable().getSize())));
    }

}
