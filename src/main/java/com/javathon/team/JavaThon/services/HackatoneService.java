package com.javathon.team.JavaThon.services;

import com.javathon.team.JavaThon.entities.Hackathon;
import com.javathon.team.JavaThon.repositories.HackathonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HackatoneService {

    private HackathonRepository hackathonRepository;

    @Autowired
    public HackatoneService (HackathonRepository hackathonRepository) {
        this.hackathonRepository = hackathonRepository;
    }

    public List<Hackathon> getAll() {
        return hackathonRepository.findAll();
    }

    public Page<Hackathon> getPage(Pageable pageable) {
        return this.hackathonRepository.findAll(pageable);
    }

}
