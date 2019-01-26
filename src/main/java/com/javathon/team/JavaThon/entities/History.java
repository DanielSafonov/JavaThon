package com.javathon.team.JavaThon.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "history", schema = "javathon_schema")
@Data
@NoArgsConstructor
public class History {

    public History(String key,
                   String value) {
        this.key = key;
        this.value = value;
    }

    @Id
    private Long id;

    private String key;

    private String value;

}
