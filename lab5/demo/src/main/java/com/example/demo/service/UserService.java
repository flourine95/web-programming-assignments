package com.example.demo.service;

import com.example.demo.dao.UserDao;
import com.example.demo.models.User;

public class UserService {
    private UserDao userDao = new UserDao();

    public boolean authenticate(String username, String password) {
        User user = userDao.getUser(username);
        return user != null && user.getPassword().equals(password);
    }
}
