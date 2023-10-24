package org.example;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> names = List.of("Kamil", "Mariusz", "Dominik");

//        StringManipulator manipulator = new StringManipulator();

        Function<String, String> reverseString = text -> new StringBuilder(text).reverse().toString();

        names.stream()
                .map(reverseString)
                .forEach(System.out::println);
//        System.out.println(names2);

//        Stream<StringBuilder> stringBuilderStream = names.stream()
//                .map(StringBuilder::new);
    }
}