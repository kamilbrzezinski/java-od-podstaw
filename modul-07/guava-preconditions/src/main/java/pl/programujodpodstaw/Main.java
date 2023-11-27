package pl.programujodpodstaw;

import com.google.common.base.Preconditions;

public class Main {
    public static void main(String[] args) {
//        System.out.println(divide(4, 0));
        System.out.println(transformWord(null));
    }

    private static int divide(int a, int b) {
        Preconditions.checkArgument(b != 0, "B musi być różne od 0");

        return a / b;
    }

    private static String transformWord(String word) {
        Preconditions.checkNotNull(word, "Przekazane słowo nie może być nullem");

        return word.toUpperCase().trim();
    }
}