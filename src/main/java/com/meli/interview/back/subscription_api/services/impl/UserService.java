package com.meli.interview.back.subscription_api.services.impl;

import com.meli.interview.back.subscription_api.dao.impl.UserDAO;
import com.meli.interview.back.subscription_api.models.User;
import com.meli.interview.back.subscription_api.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.UUID;

public class UserService implements IUserService {

    @Autowired
    private UserDAO userDAO;

    @Override
    public User createUser(String name) {
        User newUser = User.builder()
                .id(UUID.randomUUID().toString())
                .name(name)
                .build();
        return userDAO.saveUser(newUser);
    }

    @Override
    public User getUserById(String id) {
        return userDAO.findUserById(id);
    }
}
