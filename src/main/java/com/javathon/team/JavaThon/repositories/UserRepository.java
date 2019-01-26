package com.javathon.team.JavaThon.repositories;

import com.javathon.team.JavaThon.entities.Users;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository  extends CrudRepository<Users, Long> {
    public Users findByPhoneNumber(String phoneNumber);
}
