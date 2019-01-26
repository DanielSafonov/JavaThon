package com.javathon.team.JavaThon.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TEAMS")
public class Teams {
    @Id
    @Column(name="ID")
    private long id;
    @Column(name="NAME")
    private String name;
    @Column(name="HACKATHON_ID")
    private String hackathonId;

    public long getId() {
        return id;
    }

    public void setId(long id) {
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
