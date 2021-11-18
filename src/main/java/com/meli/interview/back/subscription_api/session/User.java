package com.meli.interview.back.subscription_api.session;

import com.meli.interview.back.subscription_api.subscription.Subscription;

import java.util.ArrayList;
import java.util.List;

public class User {

    private List<Subscription> trips = new ArrayList<Subscription>();
    private List<User> friends = new ArrayList<User>();

    public List<User> getFriends() {
        return friends;
    }

    public void addFriend(User user) {
        friends.add(user);
    }

    public void addSubscription(Subscription trip) {
        trips.add(trip);
    }

    public List<Subscription> subscriptions() {
        return trips;
    }

}
