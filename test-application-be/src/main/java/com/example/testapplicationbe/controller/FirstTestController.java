package com.example.testapplicationbe.controller;

import com.example.testapplicationbe.model.User;
import com.example.testapplicationbe.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class FirstTestController {

    @Autowired
    private UserService userService;

    @GetMapping("/hello")
    public String sayHello(@RequestParam(value = "myName", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }

    @GetMapping("/api/users")
    public List<User> getUsers() {
        List<User> allUsers = new ArrayList<>();
        allUsers = userService.getUsers();
        return allUsers;
       /* User user1 = new User();
        user1.setId(1);
        user1.setEmail("email1");
        user1.setName("name1");;
        User user2 = new User();
        user2.setId(2);
        user2.setEmail("email2");
        user2.setName("name2");

        return new ArrayList<>(Arrays.asList(user1,user2));*/

    }

    @PostMapping("/users")
    void addUser(@RequestBody User user) {
    }
}
