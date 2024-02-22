package com.meli.interview.back.subscription_api.dao.impl;

import com.meli.interview.back.subscription_api.dao.ISubscriptionDAO;
import com.meli.interview.back.subscription_api.models.Subscription;
import com.meli.interview.back.subscription_api.models.exceptions.CollaboratorCallException;
import com.meli.interview.back.subscription_api.models.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class SubscriptionDAO implements ISubscriptionDAO {

    @Override
    public List<Subscription> findSubscriptionByUser(User user) {
        return null;
    }

    @Override
    public Subscription saveSubscription(Subscription subscription) {
        return null;
    }
}
