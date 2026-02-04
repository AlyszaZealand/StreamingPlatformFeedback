package com.example.streamingplatformfeedback.service;

import com.example.streamingplatformfeedback.model.Favorite;
import com.example.streamingplatformfeedback.model.User;
import com.example.streamingplatformfeedback.repository.SqlRepository;
import com.example.streamingplatformfeedback.repository.UserRepository;
import com.example.streamingplatformfeedback.service.ValidateException;

import java.util.List;

public class UserService {

    private final UserRepository userRepo;

    public UserService(UserRepository repo) {
        this.userRepo = repo;
    }


    private void validate(User user) {
        if (user == null) {
            throw new ValidateException("User is null");
        }
    }

    public List<User> getAllUser() {
        return userRepo.findAll();
    }

    public List<User> findByEmail(String email) {
        return userRepo.findByEmail(email);
    }

}
