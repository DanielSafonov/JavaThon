package com.javathon.team.JavaThon.repositories;

import com.javathon.team.JavaThon.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface UserRepository  extends JpaRepository<User, Long> {

    User findByPhoneNumberAndPassword(String phoneNumber, String password);

}
