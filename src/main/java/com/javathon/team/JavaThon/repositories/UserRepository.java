package com.javathon.team.JavaThon.repositories;

import com.javathon.team.JavaThon.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository  extends CrudRepository<User, Long> {
    public User findByPhoneNumber(String phoneNumber);
}
