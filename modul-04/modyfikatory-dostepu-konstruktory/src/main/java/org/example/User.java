package org.example;

public class User {
    private static User INSTANCE;

    private User() {}

    public static User getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new User();
        }

        return INSTANCE;
    }
}
