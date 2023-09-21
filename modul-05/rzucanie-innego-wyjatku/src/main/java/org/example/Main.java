package org.example;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        BigDecimal a = new BigDecimal("10");
        BigDecimal b = new BigDecimal("0");

        try {
            a = a.divide(b);
            System.out.println(a);
        } catch (ArithmeticException e) {
            // TEGO NIGDY NIE ROBIMY!!!
        }
    }
}