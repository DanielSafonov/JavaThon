package com.javathon.team.JavaThon.controllers;

import com.javathon.team.JavaThon.entities.User;
import com.javathon.team.JavaThon.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class AuthController {
    @Autowired
    private UserService userService;
    @RequestMapping(value = "/auth", method = RequestMethod.POST)
    public ResponseEntity auth(@RequestBody User rq) {
        if(userService.auth(rq))
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .build();
        else
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .build();
    }
}
