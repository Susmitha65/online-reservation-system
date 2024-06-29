package com.example.reservation.controller;

import com.example.reservation.model.User;
import com.example.reservation.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/login")
public class LoginController {
    @Autowired
    private LoginService loginService;

    @PostMapping
    public User login(@RequestParam String username, @RequestParam String password) {
        return loginService.login(username, password);
    }
}
