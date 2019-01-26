package com.javathon.team.JavaThon.dto;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.awt.print.Pageable;

@Component
@Data
public class RequestDTO {

    PageableDTO pageable;

}
