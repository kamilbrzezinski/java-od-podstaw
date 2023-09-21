package org.example;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Money money1 = new Money(20, "PLN");
        Money money2 = new Money(20, "PLN");
        Money money3 = new Money(20, "PLN");

//        System.out.println(money1.equals(money1));
//        System.out.println(money1.equals(money2));
//        System.out.println(money2.equals(money3));
//        System.out.println(money1.equals(money3));
        System.out.println(money1.equals(null));

//        User user1 = new User("Kamil", "Brzezinski", 35);
//        User user2 = new User("Kamil", "Brzezinski", 35);
//        User user3 = new User("Mariusz", "Walaszek", 30);
//
//        Map<User, String> map = new HashMap<>();
//        map.put(user1, "pierwszy user");
//        map.put(user2, "drugi user");
//        map.put(user3, "trzeci user");
//
//        System.out.println(map.get(user2));
    }
}