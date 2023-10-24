package org.example;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        UserFinder userFinder = new UserFinder();

        Optional<User> user = userFinder.findUser("Rafał");
//        user.ifPresent(u -> System.out.println(u.getAge()));
        user.ifPresentOrElse(u -> System.out.println(u.getAge()),
                () -> System.out.println("Nie znaleziono użytkownika"));
    }
}