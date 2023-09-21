package org.example;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        String name = null;

        if (name != null && name.equalsIgnoreCase("Kamil")) {
            System.out.println("Tak, imię to Kamil!");
        }

        if ("Kamil".equalsIgnoreCase(name)) {
            System.out.println("Tak, imię to Kamil!");
        }

//        if ("Kamil".equals(name)) {
//            System.out.println("Tak, imię to Kamil!");
//        }
//
//        if (Objects.equals(name, "Kamil")) {
//            System.out.println("Tak, imię to Kamil!");
//        }
    }
}