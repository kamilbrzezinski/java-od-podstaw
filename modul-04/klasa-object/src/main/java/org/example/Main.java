package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        Developer developer = new Developer();

        List<Object> people = new ArrayList<>();
        people.add(user);
        people.add(developer);
    }
}