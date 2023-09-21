package org.example;

//import java.util.ArrayList;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> countriesAndCapitals = new HashMap<>();

        countriesAndCapitals.put("Niemcy", "Berlin");
        countriesAndCapitals.put("Francja", "Paryż");
        countriesAndCapitals.put("Polska", "Warszawa");

//        System.out.println(countriesAndCapitals.containsValue("Paryż"));
        Set<String> keys = countriesAndCapitals.keySet();

        for (String key : keys) {
            System.out.println(key + " - " +
                    countriesAndCapitals.get(key));
        }

//        System.out.println(countriesAndCapitals.get("Polska"));

//        String name1 = "Mariusz";
//        String name2 = "Dominik";
//        String name3 = "Agata";

//        HashSet<String> guests = new HashSet<>();
//        guests.add(name1);
//        guests.add(name2);
//        guests.add(name3);
//        guests.add("Mariusz");
//
//        System.out.println(guests.contains("Mariusz"));

//        for (String guest : guests) {
//            System.out.println(guest);
//        }

//        ArrayList<String> guests = new ArrayList<>();
//        guests.add(name1);
//        guests.add(name2);
//        guests.add(name3);
//        guests.add("Mariusz");

//        guests.remove("Dominik");
//        guests.remove("Mariusz");

//        System.out.println(guests.size());

//        System.out.println(guests.get(2));

//        System.out.println(guests.contains("Rafał"));

//        for (String guest : guests) {
//            System.out.println(guest);
//        }

//        String[] guests = new String[] {name1, name2, name3, "Kamil"};
//        guests[0] = name1;
//        guests[1] = name2;
//        guests[2] = name3;

//        for (String guest : guests) {
//            System.out.println(guest);
//        }

//        for (int i=0; i< guests.length; i++) {
//            System.out.println(guests[i]);
//        }

//        guests[0] = "Kamil";
//
//        System.out.println();
//        for (int i=0; i< guests.length; i++) {
//            System.out.println(guests[i]);
//        }
    }
}