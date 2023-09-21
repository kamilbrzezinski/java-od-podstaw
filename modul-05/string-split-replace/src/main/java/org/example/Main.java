package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String names = "Kamil;Rafał;Mariusz;Dominik";
        names = names.replace(";", "");

        System.out.println(names);

//        String[] namesArray = names.split(";");
//
//        List<String> namesList = new ArrayList<>();
//        namesList.addAll(Arrays.asList(namesArray));
//
//        System.out.println(namesList.size());
    }
}