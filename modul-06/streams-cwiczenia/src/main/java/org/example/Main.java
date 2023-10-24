package org.example;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<User> users = prepareData();

        // 1. Wyświetl imiona użytkowników, którzy znają Javę
//        users.stream()
//                .filter(user -> user.skills().contains("Java"))
//                .map(User::name)
//                .forEach(System.out::println);

        // 2. Wyświetl imiona i wiek nieaktywnych użytkowników
//        users.stream()
//                .filter(user -> !user.isActive())
//                .map(user -> user.name() + ", " + user.age())
//                .forEach(System.out::println);

        // 3. Znajdź użytkowników, którzy znają co najmniej 3 języki,
        // wyświetl imiona tych użytkowników oraz języki, które znają

//        users.stream()
//                .filter(user -> user.skills().size() >= 3)
//                .map(user -> user.name() + " : " + String.join(", ", user.skills()))
//                .forEach(System.out::println);

        // 4. Znajdź użytkownika, który zna najwięcej technologii.
        // Wyświetl jego imię oraz listę technologii.

//        Optional<User> mostSkilledUser = users.stream()
//                .max(Comparator.comparing(user -> user.skills().size()));
//        System.out.println(mostSkilledUser.get().name() + " : " + String.join(", ", mostSkilledUser.get().skills()));

        // 5. Wyświetl średni wiek aktywnych użytkowników
//        OptionalDouble average = users.stream()
//                .filter(User::isActive)
//                .mapToInt(User::age)
//                .average();
//        System.out.println(average.getAsDouble());

        // 6. Wyświetl średni wiek nieaktywnych użytkowników
//        OptionalDouble average = users.stream()
//                .filter(user -> !user.isActive())
//                .mapToInt(User::age)
//                .average();
//        System.out.println(average.getAsDouble());

        // 7. Wyświetl ile średnio technologii zna użytkownik
//        OptionalDouble average = users.stream()
//                .mapToInt(user -> user.skills().size())
//                .average();
//        System.out.println(average.getAsDouble());

        // 8. Podziel użytkowników na tych, którzy znają Javę
        // oraz na tych, którzy Javy nie znają. Wyświetl imiona
        // oraz technologie użytkowników z obu grup.

//        Map<Boolean, List<User>> usersMap = users.stream()
//                .collect(Collectors.partitioningBy(user -> user.skills().contains("Java")));
//
//        usersMap.get(true).stream()
//                .map(user -> user.name() + ":" + String.join(", ", user.skills()))
//                .forEach(System.out::println);
//
//        System.out.println();
//
//        usersMap.get(false).stream()
//                .map(user -> user.name() + ":" + String.join(", ", user.skills()))
//                .forEach(System.out::println);

        // 9. Sprawdź czy wszyscy użytkownicy mają więcej niż 25 lat
//        boolean over25 = users.stream()
//                .allMatch(user -> user.age() > 25);
//
//        System.out.println(over25);

        // 10. Sprawdź czy istnieje użytkownik, który ma 40 lub więcej lat
//        boolean greaterOrEqual40 = users.stream()
//                .anyMatch(user -> user.age() >= 40);
//
//        System.out.println(greaterOrEqual40);

        // 11. Znajdź najstarszego użytkownika, który zna Javę
//        Optional<User> oldestJavaProgrammer = users.stream()
//                .filter(user -> user.skills().contains("Java"))
//                .max(Comparator.comparing(User::age));
//
//        System.out.println(oldestJavaProgrammer.get().name() + ", " + oldestJavaProgrammer.get().age());

        // 12. Znajdź użytkowników znających języki,
        // których nazwy zaczynają się na literę C.
        // Wyświetl imiona oraz technologie tych użytkowników.

//        users.stream()
//                .filter(user -> user.skills().stream().anyMatch(skill -> skill.startsWith("C")))
//                .map(user -> user.name() + ":" + String.join(", ", user.skills()))
//                .forEach(System.out::println);

        // 13. Utwórz mapę, która jako klucz otrzyma imię użytkownika,
        // a jako wartość liczbę technologii, które zna użytkownik

//        Map<String, Integer> usersAndNumberOfSkills = users.stream()
//                .collect(Collectors.toMap(
//                        User::name,
//                        user -> user.skills().size()
//                ));
//        System.out.println(usersAndNumberOfSkills.get("Kamil"));
//        System.out.println(usersAndNumberOfSkills.get("Asia"));

        // 14. Wybierz z podanej listy słowa, które są palindromami
//        List<String> words = List.of("kajak", "oko", "komputer", "ala", "zakaz", "java", "programowanie");
//
//        words.stream()
//                .filter(word -> word.contentEquals(new StringBuilder(word).reverse()))
//                .forEach(System.out::println);

        // 15. Wyświetl wszystkie słowa z podanej listy,
        // oddziel je przecinkami, zadbaj o to, żeby zamienić
        // wszystkie litery na duże
//        List<String> words = List.of("kajak", "oko", "komputer", "ala", "zakaz", "java", "programowanie");
//
//        String allWords = words.stream()
//                .map(String::toUpperCase)
//                .collect(Collectors.joining(","));
//        System.out.println(allWords);

        // 16. Mając dwie listy liczb całkowitych, znajdź
        // najmniejszą liczbę parzystą

        List<Integer> list1 = List.of(62, 55, 120, 17, 7, 11);
        List<Integer> list2 = List.of(42, 27, 35, 98);

        Integer integer = Stream.concat(list1.stream(), list2.stream())
                .sorted()
                .filter(a -> a % 2 == 0)
                .findFirst()
                .get();
        System.out.println(integer);

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