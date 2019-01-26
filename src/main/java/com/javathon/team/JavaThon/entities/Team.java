package com.javathon.team.JavaThon.entities;

import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="TEAMS")
@NoArgsConstructor
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="NAME")
    private String name;
    @Column(name="HACKATHON_ID")
    private String hackathonId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHackathonId() {
        return hackathonId;
    }

    public void setHackathonId(String hackathonId) {
        this.hackathonId = hackathonId;
    }
}
