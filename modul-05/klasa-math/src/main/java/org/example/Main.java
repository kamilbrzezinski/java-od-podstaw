package org.example;

public class Main {
    public static void main(String[] args) {
//        int max = Math.max(2, 4);
//        System.out.println(max);

//        double result = Math.pow(2, 4);
//        System.out.println(result);

//        System.out.println(Math.PI);

        int a = Integer.MAX_VALUE;
        a = a + 1;
        System.out.println(a);

        int b = Integer.MIN_VALUE;
        System.out.println(b);

        int result = Math.addExact(Integer.MAX_VALUE, 1);
        System.out.println(result);
    }
}