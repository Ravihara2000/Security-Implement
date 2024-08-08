package com.telusko.SpringSecurityEx.controller;

import com.telusko.SpringSecurityEx.model.Users;
import com.telusko.SpringSecurityEx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

//us1,12ww
@RestController
public class UserController {

    @Autowired
    private UserService userService;;

    @PostMapping("/register")
    public Users register(@RequestBody Users users) {
        return userService.registerUser(users);
    }

    @PostMapping("/login")
    public String login(@RequestBody Users users) {
        return userService.loginUser(users);
    }
}
