package com.example.demo.dao;

import com.example.demo.models.User;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
    private static List<User> users = new ArrayList<>();

    static {
        users.add(new User("admin", "12345", "Admin User"));
        users.add(new User("user1", "password1", "User One"));
        users.add(new User("user2", "password2", "User Two"));
        users.add(new User("user3", "password3", "User Three"));
    }

    public User getUser(String username) {
        return users.stream().filter(u -> u.equalsUsername(username)).findFirst().orElse(null);
    }
}
