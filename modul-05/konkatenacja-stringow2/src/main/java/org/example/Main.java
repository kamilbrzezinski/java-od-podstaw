package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class Main {
    public static void main(String[] args) {
//        String name = "Kamil";
//        String lastName = "Brzeziński";
//        int age = 35;

//        System.out.println("Imię to " + name + " a nazwisko to "
//        + lastName);
//        System.out.println("Mam na imię " + name + " i mam " + age +
//                " lat.");
//        System.out.println("Mam " + (33 + 2) + " lat");
//        System.out.println(33 + 2 + " to mój wiek");
//        String text = "Mam na imię ";
//        text = text.concat(name);
//        text = text.concat(" i mam ");
//        text = text.concat(String.valueOf(age));
//        text = text.concat(" lat.");
//        System.out.println(text);
        List<String> names = new ArrayList<>();
        names.add("Kamil");
        names.add("Mariusz");
        names.add("Dominik");

//        String joinedNames = String.join("; ", names);
//        System.out.println(joinedNames);

        StringJoiner joiner = new StringJoiner("-");
        joiner.add("Kamil");
        joiner.add("Mariusz");
        joiner.add("Rafał");

        System.out.println(joiner);

//        StringBuilder builder = new StringBuilder();
//        StringBuffer buffer = new StringBuffer();

//        for (String name : names) {
//            builder.append(name.toUpperCase());
//            builder.append(", ");
//        }
//
//        builder.delete(builder.length()-2, builder.length()-1);

//        System.out.println(builder);
    }
}