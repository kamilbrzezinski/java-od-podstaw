package org.example;

import java.util.Scanner;

public class Class2 {
    public Class2() {
        User user = new User("Mariusz", 20);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wiek: ");
        int userAge = scanner.nextInt();

        user.setAge(userAge);
    }
}
