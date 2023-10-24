package org.example;

import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        List<User> users = prepareData();

//        boolean anyMatchJava = users.stream()
//                .anyMatch(user -> user.skills().contains("Java"));
//        System.out.println(anyMatchJava);
//
//        boolean noneMatchGolang = users.stream()
//                .noneMatch(user -> user.skills().contains("Golang"));
//        System.out.println(noneMatchGolang);
//
//        boolean allMatch = users.stream()
//                .allMatch(user -> user.age() >= 18);
//        System.out.println(allMatch);

//        Optional<User> first = users.stream()
//                .filter(user -> user.age() > 25)
//                .findFirst();
//        System.out.println(first.get());
//
//        Optional<User> any = users.stream()
//                .filter(user -> user.age() > 25)
//                .findAny();
//        System.out.println(any.get());

        int asInt = IntStream.range(0, 100)
                .parallel()
                .findFirst().getAsInt();
        System.out.println(asInt);

        int asInt2 = IntStream.range(0, 100)
                .parallel()
                .findAny().getAsInt();
        System.out.println(asInt2);

//        int[] numbers = new int[] {1, 5, 10, 17, 192};
//        OptionalInt max = Arrays.stream(numbers)
//                .max();
//        System.out.println(max.getAsInt());
//
//        OptionalInt min = IntStream.of(1, 5, 10, 77, 98, 141)
//                .min();
//        System.out.println(min.getAsInt());

//        IntStream.rangeClosed(0, 10)
//                .forEach(System.out::println);

//        List<String> names = List.of("Kamil", "Mariusz", "Dominik");
//        List<String> names2 = List.of("Karol", "Rafał");
//
//        Stream.concat(names.stream(), names2.stream())
//                .filter(name -> name.startsWith("K"))
//                .forEach(System.out::println);

//        Map<Integer, List<String>> collect = users.stream()
//                .map(User::name)
//                .collect(Collectors.groupingBy(String::length));
//
//        System.out.println(collect);

//        Map<Boolean, List<User>> collect = users.stream()
//                .collect(Collectors.partitioningBy(User::isActive));
//        System.out.println(collect);

//        IntSummaryStatistics statistics = users.stream()
//                .collect(Collectors.summarizingInt(User::age));
//
//        System.out.println(statistics.getCount());
//        System.out.println(statistics.getAverage());
//        System.out.println(statistics.getSum());
//        System.out.println(statistics.getMax());
//        System.out.println(statistics.getMin());

//        long numberOfElements = users.stream().count();
//        System.out.println(numberOfElements);

//        Integer sumOfAges = users.stream()
//                .collect(Collectors.summingInt(User::age));
//        System.out.println(sumOfAges);
//
//        Double averageAge = users.stream().collect(Collectors.averagingInt(User::age));
//        System.out.println(averageAge);
//
//        Optional<Integer> maxAge = users.stream()
//                .map(User::age)
//                .max(Comparator.naturalOrder());
//        System.out.println(maxAge.get());
//
//        Optional<Integer> minAge = users.stream()
//                .map(User::age)
//                .min(Comparator.naturalOrder());
//        System.out.println(minAge.get());

//        String collect = users.stream()
//                .map(User::skills)
//                .flatMap(Collection::stream)
//                .collect(Collectors.joining(", "));
//
//        System.out.println(collect);


//        Country country = new Country("Poland", "Warsaw");
//        Country country1 = new Country("Germany", "Berlin");
//        Country country2 = new Country("France", "Paris");
//        Country country3 = new Country("Poland", "Cracow");
//
//        List<Country> countries = List.of(country, country1, country2, country3);
//
//        Map<String, String> countriesAndCapitals = countries.stream()
//                .collect(Collectors.toMap(Country::name, Country::capital,
//                        (oldValue, newValue) -> oldValue));
//
//        System.out.println(countriesAndCapitals.get("Poland"));

    }

    private static List<User> prepareData() {
        List<User> users = new ArrayList<>();

        users.add(new User("Kamil", 35, List.of("Java", "Python", "JavaScript"), true));
        users.add(new User("Mariusz", 30, List.of("Java", "C++", "C#"), true));
        users.add(new User("Dominik", 20, List.of("Java", "Dart", "Python"), false));
        users.add(new User("Rafał", 40, List.of("C", "C++", "C#"), true));
        users.add(new User("Paulina", 31, List.of("Python", "JavaScript", "Rust"), true));
        users.add(new User("Kasia", 30, List.of("PHP", "Haskell"), false));
        users.add(new User("Asia", 25, List.of("Java", "Scala", "Kotlin", "Haskell", "Clojure"), true));

        return users;
    }
}