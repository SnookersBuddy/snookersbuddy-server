package com.example.testapplicationbe.service;

import com.example.testapplicationbe.model.User;
import com.example.testapplicationbe.persistence.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public List<User> getUsers(){
        return userDao.getAllUsers();
    }
}
