package com.javathon.team.JavaThon.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PageableDTO {

    private Integer page;

    private Integer size;

    private String sort;

}
