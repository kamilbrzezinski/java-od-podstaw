package org.example;

public class Main {
    public static void main(String[] args) {
        Money money1 = new Money(20, "PLN");
        Money money2 = new Money(20, "PLN");

        System.out.println(money1.equals(money2));
        System.out.println(money1.currency());
        System.out.println(money1.toString());
    }
}