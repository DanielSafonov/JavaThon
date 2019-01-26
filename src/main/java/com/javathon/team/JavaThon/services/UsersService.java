package com.javathon.team.JavaThon.services;

import com.javathon.team.JavaThon.entities.User;
import com.javathon.team.JavaThon.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UsersService implements UserDetailsService {

    @Autowired
    private UserRepository usersRepo;

    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return usersRepo.findByPhoneNumber(username);
    }

    public String getUserByPhoneNumber(String number) {

        return usersRepo.findByPhoneNumber(number).getPhoneNumber();
    }

    /**
     * Check if received user could logIn, check by phoneNumber field
     *
     * @param user - should contain phoneNumber
     * @return
     */
    public boolean login(User user) {

        return "".equals(usersRepo.findByPhoneNumber(user.getPhoneNumber()).toString());
    }
}
