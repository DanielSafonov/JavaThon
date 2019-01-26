package com.javathon.team.JavaThon.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@Entity
@Table(name="hackaton", schema = "javathon_schema")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Hackathon {

    @Id
    @Column(name="id")
    private long id;
    @Column(name="name")
    private String name;
    @Column(name="start_time")
    private Timestamp startTime;
    @Column(name="end_time")
    private Timestamp endTime;
//    @Column(name="DESCRIPTION")
//    private String description;
    @Column(name="participants_limit")
    private int participantsLimit;

//    public long getId() {
//        return id;
//    }
//
//    public void setId(long id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public Timestamp getStartTime() {
//        return startTime;
//    }
//
//    public void setStartTime(Timestamp startTime) {
//        this.startTime = startTime;
//    }
//
//    public Timestamp getEndTime() {
//        return endTime;
//    }
//
//    public void setEndTime(Timestamp endTime) {
//        this.endTime = endTime;
//    }
//
////    public String getDescription() {
////        return descript ion;
//////    }
//////
//////    public void setDescription(String description){
////        this.description = description;
////    }
//
//    public int getParticipantsLimit() {
//        return participantsLimit;
//    }
//
//    public void setParticipantsLimit(int participantsLimit) {
//        this.participantsLimit = participantsLimit;
//    }
}
