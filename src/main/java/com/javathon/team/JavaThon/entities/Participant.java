package com.javathon.team.JavaThon.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="PARTICIPANTS")
@Data
@NoArgsConstructor
public class Participant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    @JoinColumn(name = "TEAM_ID")
    private Team team;
    @ManyToOne
    @JoinColumn(name = "USER_ID")
    private User user;
}
