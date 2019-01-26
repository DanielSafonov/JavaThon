package com.javathon.team.JavaThon.rest.resources;

import com.javathon.team.JavaThon.entities.User;
import com.javathon.team.JavaThon.services.UsersService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/user")
public class UserResources {

    private UsersService usersService;

    public UserResources (UsersService userService) {
        this.usersService = userService;
    }

    @PostMapping("/login")
    public ResponseEntity loginController(@RequestBody User rq) {

        if(usersService.login(rq)) {
            return ResponseEntity
                    .ok("Logged in");
        } else {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body("Failded logIn");
        }
    }

}
