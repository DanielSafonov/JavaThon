package com.javathon.team.JavaThon.services;

import com.javathon.team.JavaThon.repos.UsersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service //Класс-сервис
public class UsersService implements UserDetailsService {
    @Autowired //Автосвязывание сервиса и репозитория доступа к профилям пользоввателей
    private UsersRepo usersRepo;

    @Override //Переопределение метода возврата профиля пользователя по username
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return usersRepo.findByUsername(username);
    }
}
