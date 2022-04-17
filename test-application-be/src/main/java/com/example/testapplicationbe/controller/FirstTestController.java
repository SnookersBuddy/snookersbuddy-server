package com.example.testapplicationbe.controller;

import com.example.testapplicationbe.model.User;
import com.example.testapplicationbe.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class FirstTestController {
    private final UserService userService;

    @Autowired
    public FirstTestController(final UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/hello")
    public String sayHello(@RequestParam(value = "myName", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }

    @GetMapping("/api/users")
    public List<User> getUsers() {
        return userService.getUsers();
    }

    @PostMapping("/users")
    void addUser(@RequestBody User user) {
    }
}
