package com.meli.interview.back.subscription_api.models;

import com.meli.interview.back.subscription_api.models.exceptions.UserNotLoggedInException;
import lombok.Setter;

public class UserSession {

    private static final UserSession USER_SESSION = new UserSession();

    @Setter
    private static User loggedUser;

    private UserSession(){}

    public static UserSession getInstance() { return USER_SESSION;}

    public User getLoggedUser() {
        if (loggedUser == null){
            throw new UserNotLoggedInException();
        }
        return loggedUser;
    }

    public static void clearSession(){
        loggedUser = null;
    }
}
