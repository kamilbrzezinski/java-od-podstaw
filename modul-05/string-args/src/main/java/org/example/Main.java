package org.example;

public class Main {
    public static void main(String[] args) {

        if (args.length != 2) {
            System.out.println("Błędna liczba argumentów!");
            System.exit(0);
        }

        System.out.println("Imię: " + args[0]);
        System.out.println("Wiek: " + args[1]);
    }
}