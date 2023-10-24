package org.example;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) {
        List<String> names = List.of("Kamil", "Mariusz", "Dominik");

        // 1. Kamil
        // 2. Mariusz
        // 3. Dominik

        for (int i = 0; i < names.size(); i++) {
            System.out.println(i+1 + ". " + names.get(i));
        }

        System.out.println();

        int i = 1;
        for (String name : names) {
            System.out.println(i++ + ". " + name);
        }

        System.out.println();

        int index = 1;
        names.forEach(name -> System.out.println(index + ". " + name));

        System.out.println();

        AtomicInteger atomicIndex = new AtomicInteger(1);
        names.forEach(name -> System.out.println(atomicIndex.getAndIncrement() + ". " + name));
    }
}