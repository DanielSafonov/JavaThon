package com.javathon.team.JavaThon.services;

import com.javathon.team.JavaThon.entities.User;
import com.javathon.team.JavaThon.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService  {

    @Autowired
    private UserRepository userRepository;


    public User getUser(Long id) {
        return userRepository.findByid(id);
    }

    public void addUser(User user) {
        userRepository.save(user);
    }

    public void updateUser(User user) {
        userRepository.save(user);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

}
