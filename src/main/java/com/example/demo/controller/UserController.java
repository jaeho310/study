package com.example.demo.controller;

import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api/v1")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("")
    public ResponseEntity<?> getUsers() {
        userService.getUsers();
    }
}
