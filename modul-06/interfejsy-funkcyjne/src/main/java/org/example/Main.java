package org.example;

public class Main {
    public static void main(String[] args) {
        User user = new User("Kamil");

        user.greet(name -> System.out.println("Cześć " + name));

        user.greet(name -> System.out.println("Siema " + name));

        Thread t1 = new Thread(() -> System.out.println("t1"));

        Thread t2 = new Thread(() -> System.out.println("t2"));

        Thread t3 = new Thread(() -> System.out.println("t3"));

        t1.start();
        t2.start();
        t3.start();
    }
}