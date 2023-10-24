package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        User user = new User("Kamil", "user");
        User user1 = new User("Mariusz", "moderator");
        User user2 = new User("Dominik", "administrator");

        List<User> users = List.of(user, user1, user2);

        List<User> users2 = users.stream()
                .map(u -> {
                    u.setType("user");
                    return u;
                }).toList();

        users.forEach(u -> System.out.println(u.getType()));
        users2.forEach(u -> System.out.println(u.getType()));
    }
}