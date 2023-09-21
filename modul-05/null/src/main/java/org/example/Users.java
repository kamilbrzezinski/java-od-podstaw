package org.example;

import java.util.ArrayList;
import java.util.List;

public class Users {
    private List<User> users = new ArrayList<>();

    public void addUser(User user) {
        users.add(user);
    }

    public User getFirstMaleUser() {
        for (User user : users) {
            if (!user.getName().endsWith("a")) {
                return user;
            }
        }

        return null;
    }
}
