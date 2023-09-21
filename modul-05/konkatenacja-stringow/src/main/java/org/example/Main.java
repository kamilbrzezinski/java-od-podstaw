package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class Main {
    public static void main(String[] args) {
//        String name = "Kamil";
//        String lastName = "Brzeziński";
//        int age = 35;
//
//        String text = "Mam na imię ";
//        text = text.concat(name);
//        text = text.concat(". Mam ");
//        text = text.concat(String.valueOf(age));
//        text = text.concat(" lat.");
//
//        System.out.println(text);

//        System.out.println("Mam na imię " + name + " a na nazwisko "
//        + lastName + ". Mam " + age + " lat.");
//        System.out.println("Mam " + (33 + 2) + " lat.");
//        System.out.println(33 + 2 + " to mój wiek.");

        List<String> names = new ArrayList<>();
        names.add("Kamil");
        names.add("Mariusz");
        names.add("Dominik");

//        String joinedNames = String.join(";", names);
//        System.out.println(joinedNames);
        StringJoiner joiner = new StringJoiner("-");
        joiner.add("Kamil");
        joiner.add("Mariusz");
        joiner.add("Rafał");

        System.out.println(joiner);

//        StringBuilder builder = new StringBuilder();
//        StringBuffer buffer = new StringBuffer();

        // thread - safe

//        for (String name : names) {
//            builder.append(name.toUpperCase());
//            builder.append(", ");
//        }

        // K A M I L -> 5
        // 0 1 2 3 4
//        builder.delete(builder.length()-2, builder.length()-1);
//
//        System.out.println(builder);
    }
}