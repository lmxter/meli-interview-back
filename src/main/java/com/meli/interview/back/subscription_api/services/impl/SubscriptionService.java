package com.meli.interview.back.subscription_api.services.impl;

import com.meli.interview.back.subscription_api.dao.impl.SubscriptionDAO;
import com.meli.interview.back.subscription_api.models.Subscription;
import com.meli.interview.back.subscription_api.models.exceptions.UserNotLoggedInException;
import com.meli.interview.back.subscription_api.models.User;
import com.meli.interview.back.subscription_api.models.UserSession;

import java.util.ArrayList;
import java.util.List;

public class SubscriptionService {

    /**
     * Devuelve el costo total de las suscripciones de un usuario siempre que el usuario que esté logueado
     * se encuentre en su lista de amigos
     * @param user
     * @return costo total de la suscripciones del user
     * @throws UserNotLoggedInException si no hay un usuario logueado
     */
    public Float getUserSubscriptionsCost(User user) throws UserNotLoggedInException {
        List<Subscription> subscriptionList = new ArrayList<>();

        // get logged user
        User loggedUser = UserSession.getInstance().getLoggedUser();
        boolean isFriend = false;
        if (loggedUser != null) {
            for (User friend : user.getFriends()) {
                if (friend == loggedUser) {
                    isFriend = true;
                    break;
                }
            }
            if (isFriend) {
                subscriptionList = SubscriptionDAO.findSubscriptionByUser(user);
            }

            float totalPrice = 0;

            for (Subscription subscription : subscriptionList) {
                totalPrice += subscription.getPrice();
            }

            return totalPrice;
        } else {
            throw new UserNotLoggedInException();
        }
    }
}
