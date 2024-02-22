package com.meli.interview.back.subscription_api.dao;

import com.meli.interview.back.subscription_api.models.User;

public interface IUserDAO {
    User saveUser(User user);
    User findUserById(String id);
}
