package org.example;

import java.util.InputMismatchException;

public class PositiveNumbersCalculator {
    public static int sum(int a, int b) {
        if (a <= 0 || b <= 0) {
            throw new NumberNotPositiveException("Liczba musi być większa od 0!");
        }

        return a + b;
    }
}
