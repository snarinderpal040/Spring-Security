package com.narinder.learnspringsecurity.services;

import com.narinder.learnspringsecurity.models.Users;
import com.narinder.learnspringsecurity.repositories.CreateUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UsersService {

    @Autowired
    private PasswordEncoder encoder;

    @Autowired
    private CreateUserRepository repo;

    public String save(Users user) {
        user.setPassword(encoder.encode(user.getPassword()));
        repo.save(user);
        return "User created";

    }

    public String deleteById(String username) {
        repo.deleteById(username);
        return "User deleted";
    }
}
