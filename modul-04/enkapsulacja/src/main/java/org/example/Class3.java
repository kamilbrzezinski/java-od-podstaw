package org.example;

import java.util.Scanner;

public class Class3 {
    public Class3() {
        User user = new User("Dominik", 25);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wiek: ");
        int userAge = scanner.nextInt();

        user.setAge(userAge);
        System.out.println(user.getAge());
    }
}
