package com.meli.interview.back.subscription_api.dao;

import com.meli.interview.back.subscription_api.models.Subscription;
import com.meli.interview.back.subscription_api.models.User;

import java.util.List;

public interface ISubscriptionDAO {

    List<Subscription> findSubscriptionByUser(User user);
    Subscription saveSubscription(Subscription subscription);
}
