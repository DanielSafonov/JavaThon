package com.javathon.team.JavaThon.repositories;

import com.javathon.team.JavaThon.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository  extends CrudRepository<User, Long> {
    User findByid(Long id);
}
