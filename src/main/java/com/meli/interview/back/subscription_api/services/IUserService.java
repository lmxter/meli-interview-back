package com.meli.interview.back.subscription_api.services;

import com.meli.interview.back.subscription_api.models.User;

public interface IUserService {
    User createUser(String name);
    User getUserById(String id);

}
