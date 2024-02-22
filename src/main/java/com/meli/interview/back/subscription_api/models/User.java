package com.meli.interview.back.subscription_api.models;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private String id;
    private String name;
    @Builder.Default
    private List<Subscription> subscriptions = new ArrayList<>();
    @Builder.Default
    private List<User> friends = new ArrayList<>();

    public void addFriend(User user) {
        friends.add(user);
    }

    public void addSubscription(Subscription trip) {
        subscriptions.add(trip);
    }

    public List<Subscription> subscriptions() {
        return subscriptions;
    }
}
