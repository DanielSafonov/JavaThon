package com.javathon.team.JavaThon.repositories;

import com.javathon.team.JavaThon.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository  extends JpaRepository<User, Long> {
    User findByPhoneNumber(String phoneNumber);
}
