package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 3, 4};
        System.out.println(numbers[1]);

        List<Integer> numbers2 = new ArrayList<>();
        numbers2.add(1);
        numbers2.add(2);
        numbers2.add(3);
        numbers2.add(4);

        Integer a = 2; // autoboxing
        int b = a; // unboxing

        System.out.println(numbers2.get(0));
    }
}