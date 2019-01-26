package com.javathon.team.JavaThon.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@Entity
@Table(name="HACKATHON")
public class Hackathons {

    @Id
    @Column(name="ID")
    private long id;
    @Column(name="NAME")
    private String name;
    @Column(name="START_TIME")
    private Timestamp startTime;
    @Column(name="END_TIME")
    private Timestamp endTime;
    @Column(name="DESCRIPTION")
    private String description;
    @Column(name="PARTICIPANTS_LIMIT")
    private int participantsLimit;

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

    public Timestamp getStartTime() {
        return startTime;
    }

    public void setStartTime(Timestamp startTime) {
        this.startTime = startTime;
    }

    public Timestamp getEndTime() {
        return endTime;
    }

    public void setEndTime(Timestamp endTime) {
        this.endTime = endTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getParticipantsLimit() {
        return participantsLimit;
    }

    public void setParticipantsLimit(int participantsLimit) {
        this.participantsLimit = participantsLimit;
    }
}
