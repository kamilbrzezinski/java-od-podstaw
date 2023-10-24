package org.example;

public class User {
    private final String name;

    public User(String name) {
        this.name = name;
    }

    public void greet(Greeter greeter) {
        greeter.greet(name);
    }
}
