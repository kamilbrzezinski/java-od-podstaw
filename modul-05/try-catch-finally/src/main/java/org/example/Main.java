package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        getUserAge();
    }

    private static int getUserAge() {
//        Scanner scanner = new Scanner(System.in);

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Ile masz lat?");
            int age = scanner.nextInt();

            return age;
        } catch (InputMismatchException e) {
            System.out.println("Błędnie podany wiek!");
        }




        return -1;
    }
}