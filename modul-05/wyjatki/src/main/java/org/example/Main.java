package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        WordProcessor wordProcessor = new WordProcessor(null);
//        String processedWord = wordProcessor.stripAndCapitalize();
//
//        System.out.println(processedWord);
//        String[] names = new String[3];
//        names[0] = "Kamil";
//        names[1] = "Mariusz";
//        names[2] = "Dominik";
//
//        for (int i=0; i<= names.length; i++) {
//            System.out.println(names[i]);
//        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę ");
        int a = scanner.nextInt();
        System.out.println("Podaj drugą liczbę ");
        int b = scanner.nextInt();

        try {
            System.out.println("Wynik działania a / b " + (a / b));
        } catch (ArithmeticException e) {
            System.out.println("Nie można dzielić przez 0!");
        }

        System.out.println("Dzięki za skorzystanie z programu!");
    }
}














