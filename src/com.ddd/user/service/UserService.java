package com.ddd.user.service;

import com.ddd.user.entity.User;

public class UserService {

    public User find(long userId) {

        return new User();
    }

    private static UserService instance;

    private UserService() {

    }

    public static UserService getInstance() {

        return instance;
    }
}
