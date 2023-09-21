package org.example;

public class User {
    static int counter;

    public User() {
        counter++;
    }

    public static void hello() {
        System.out.println("hello!");
    }
}
