package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String names = "Kamil;Mariusz;Dominik";
//        String[] namesArray = names.split(";");

//        List<String> namesList = new ArrayList<>();
//        namesList.addAll(Arrays.asList(namesArray));
//
//        System.out.println(namesList.size());
        names = names.replace(";", "");
        System.out.println(names);
    }
}