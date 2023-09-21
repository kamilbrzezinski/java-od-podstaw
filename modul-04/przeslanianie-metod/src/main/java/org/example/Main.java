package org.example;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        User moderator = new Moderator();

        user.hello();
        moderator.hello();
    }
}