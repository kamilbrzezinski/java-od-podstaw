package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Jakiej marki samochód chcesz stworzyć?");
        String make = scanner.nextLine();
        System.out.println("Jaki model chcesz stworzyć?");
        String model = scanner.nextLine();
        System.out.println("Jaki kolor ma mieć samochód?");
        String color = scanner.nextLine();
        System.out.println("Z którego roku ma być?");
        int year = Integer.parseInt(scanner.nextLine());
        System.out.println("Jaką ma mieć maksymalną prędkość?");
        int maxSpeed = Integer.parseInt(scanner.nextLine());
        System.out.println("Jaki ma mieć zasięg?");
        int range = Integer.parseInt(scanner.nextLine());

        Car car = new Car(make, model, year, color, maxSpeed, range);

        System.out.println();
        System.out.println("Utworzyłeś następujący samochód:");
        System.out.println("Marka: " + car.getMake());
        System.out.println("Model:" + car.getModel());
        System.out.println("Rok produkcji: " + car.getYear());
        System.out.println("Kolor: " + car.getColor());
        System.out.println("Prędkość maksymalna: " + car.getMaxSpeed());
        System.out.println("Zasięg: " + car.getRange() + " km");

        System.out.println();

        while (true) {
            System.out.println("Wybierz opcję: ");
            System.out.println("1. Jedź");
            System.out.println("2. Uzupełnij benzynę");
            System.out.println("3. Zakończ");

            int userChoice = Integer.parseInt(scanner.nextLine());

            switch (userChoice) {
                case 1 -> {
                    System.out.println("Ile km chcesz przejechać?");
                    int distance = Integer.parseInt(scanner.nextLine());
                    car.drive(distance);
                }
                case 2 -> car.addFuel();
                case 3 -> System.exit(0);
            }

            System.out.println();
            System.out.println("Przbieg: " + car.getMileage());
            System.out.println("Pozostały zasięg: " + car.getRange());
        }
    }
}