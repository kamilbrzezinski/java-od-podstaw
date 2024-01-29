package pl.programujodpodstaw;

import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<Optional<User>> users = List.of(
                Optional.of(new User("Kamil", 35)),
                Optional.of(new User("Mariusz", 30)),
                Optional.empty(),
                Optional.of(new User("Dominik", 25)),
                Optional.of(new User("Paulina", 31)),
                Optional.of(new User("Asia", 42)),
                Optional.empty(),
                Optional.empty(),
                Optional.of(new User("Kasia", 50))
        );

        long count = users.stream()
                .flatMap(Optional::stream)
                .mapToInt(User::age)
                .filter(age -> age > 30)
                .count();

        System.out.println(count);
    }
}