package com.telusko.SpringSecurityEx.service;

import com.telusko.SpringSecurityEx.model.Users;
import com.telusko.SpringSecurityEx.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService{
    @Autowired
    private UserRepo userRepo;

    public Users registerUser(Users users) {
        return userRepo.save(users);
    }
}
