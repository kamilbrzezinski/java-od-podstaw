package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        User user = new User("Kamil", 35);

        Scanner scanner = new Scanner(System.in);
        final int userAge = scanner.nextInt();

        System.out.println(userAge);
        userAge = 30;
        System.out.println(userAge);
        userAge = 40;
    }
}