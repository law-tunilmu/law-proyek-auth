package com.law.tunilmu.authentication.services;

import com.law.tunilmu.authentication.entities.User;
import com.law.tunilmu.authentication.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> allUsers() {

        List<User> users = new ArrayList<>();

        userRepository.findAll().forEach(users::add);

        return users;
    }

    public Optional<User> getUserByName(String name) {
        return userRepository.findByUsername(name);
    }
}
