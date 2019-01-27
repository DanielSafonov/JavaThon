package com.javathon.team.JavaThon.services;

import com.javathon.team.JavaThon.entities.User;
import com.javathon.team.JavaThon.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService  {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public User getUser(Long id) {
        return userRepository.findById(id).isPresent() ? userRepository.getOne(id): null;
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

    public boolean auth(User user) {
        return userRepository.findByPhoneNumberAndPassword(user.getPhoneNumber(), user.getPassword()) != null;
    }

}
