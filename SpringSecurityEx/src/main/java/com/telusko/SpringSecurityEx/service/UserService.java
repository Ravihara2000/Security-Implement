package com.telusko.SpringSecurityEx.service;

import com.telusko.SpringSecurityEx.model.Users;
import com.telusko.SpringSecurityEx.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import javax.naming.AuthenticationException;

@Service
public class UserService{
    @Autowired
    private UserRepo userRepo;

    @Autowired
    private AuthenticationManager manager;

    @Autowired
    private JWTService jwtService;

    private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);

    public Users registerUser(Users users) {
        users.setPassword(encoder.encode((users.getPassword())));
        return userRepo.save(users);
    }

    public String loginUser(Users users) {
        Authentication authentication =
                manager.authenticate(new UsernamePasswordAuthenticationToken(users.getUsername(), users.getPassword()));
        if (((Authentication) authentication).isAuthenticated()) {
            return jwtService.generateToken();
        }
        return "Login failed";
    }
}
