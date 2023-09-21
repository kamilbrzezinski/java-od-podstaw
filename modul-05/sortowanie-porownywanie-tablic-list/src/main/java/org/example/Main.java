package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Kamil");
        names.add("Mariusz");
        names.add("Dominik");

        List<String> names2 = new ArrayList<>();
        names2.add("Kamil");
        names2.add("Dominik");
        names2.add("Mariusz");

//        System.out.println(names.equals(names2));
        System.out.println(names.containsAll(names2) && names2.containsAll(names));
    }
}