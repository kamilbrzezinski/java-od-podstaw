package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();

        User user = new User();
        User moderator = new Moderator();
        User administrator = new Administrator();

        users.add(user); // 0
        users.add(moderator); // 1
        users.add(administrator); // 2

        Administrator user1 = (Administrator) users.get(1);
        user1.deletePost();
    }
}