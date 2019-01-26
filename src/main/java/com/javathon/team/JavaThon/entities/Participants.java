package com.javathon.team.JavaThon.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PARTICIPANTS")
public class Participants {
    @Id
    @Column(name="TEAM_ID")
    private long teamId;
    @Column(name="USER_ID")
    private long userId;

    public long getTeamId() {
        return teamId;
    }

    public void setTeamId(long teamId) {
        this.teamId = teamId;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }
}
