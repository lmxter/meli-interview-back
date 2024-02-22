package com.meli.interview.back.subscription_api.dao.impl;

import com.meli.interview.back.subscription_api.dao.IUserDAO;
import com.meli.interview.back.subscription_api.models.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDAO implements IUserDAO {

    private List<User> userList = new ArrayList<>();
    @Override
    public User saveUser(User user) {
        userList.add(user);
        return user;
    }

    @Override
    public User findUserById(String id) {
        return userList.stream()
                .filter(user -> user.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}
