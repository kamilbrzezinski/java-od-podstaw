package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        displayInfo("Kamil", "Java");
    }

    private static void display(String... skills, int age)

    private static void displayInfo(String name, int age, String... skills) {
        System.out.println("Imię: " + name);
//        System.out.println("Wiek: " + age);
        System.out.println("Umiejętności: ");

        for (String skill : skills) {
            System.out.println(skill);
        }
    }
}