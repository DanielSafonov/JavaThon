package com.javathon.team.JavaThon.entities;

import lombok.*;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name="hackatons", schema = "javathon_schema")
@Data
@NoArgsConstructor
public class Hackathon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="name")
    private String name;
    @Column(name="start_time")
    private Timestamp startTime;
    @Column(name="end_time")
    private Timestamp endTime;
    @Column(name="description")
    private String description;
    @Column(name="participants_limit")
    private Integer participantsLimit;
    @Column(name="image_url")
    private String imageUrl;


}
