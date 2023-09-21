package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        for (int i=0; i<10; i++) {
//            System.out.println("Hello World!");
//        }
        boolean shouldContinue = true;
        Scanner scanner = new Scanner(System.in);

        while (shouldContinue) {
            System.out.println("Czy chcesz kontynuować?");
            String answer = scanner.nextLine();

            if (answer.equals("tak")) {
                shouldContinue = true;
            } else if (answer.equals("nie")) {
                shouldContinue = false;
            }
        }
    }
}