package com.telusko.SpringSecurityEx.service;

import com.telusko.SpringSecurityEx.model.Users;
import com.telusko.SpringSecurityEx.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService{
    @Autowired
    private UserRepo userRepo;

    private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);

    public Users registerUser(Users users) {
        users.setPassword(encoder.encode((users.getPassword())));
        return userRepo.save(users);
    }
}
