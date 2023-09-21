package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Dominik");
        names.add("Mariusz");
        names.add("Rafał");

        for (String name : names) {
            if (name.startsWith("Mariusz")) break;

            System.out.println(name);
        }
    }
}