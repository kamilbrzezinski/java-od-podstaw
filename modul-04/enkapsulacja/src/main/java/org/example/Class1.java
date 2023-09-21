package org.example;

import java.util.Scanner;

public class Class1 {
    public Class1() {
        User user = new User("Kamil", 35);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wiek: ");
        int userAge = scanner.nextInt(); // -5

        user.setAge(userAge);
    }
}
