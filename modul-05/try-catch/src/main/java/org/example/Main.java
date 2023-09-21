package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            int a = 2;
            int b = 2;
            System.out.println(a / b);

            List<String> names = new ArrayList<>();
            names.add("Kamil");
            System.out.println(names.get(0));

            String name = null;
            System.out.println(name.toLowerCase());
        } catch (ArithmeticException e) {
            System.out.println("Błąd w obliczeniach");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Indeks poza zakresem");
        } catch (NullPointerException e) {
            System.out.println("Gdzieś masz nulla!");
        }

    }
}