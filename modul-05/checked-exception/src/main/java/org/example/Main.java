package org.example;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        NamesReader namesReader = new NamesReader("src/main/resources/names2.txt");
        try {
            namesReader.printAllNames();
        } catch (IOException e) {
            System.out.println("Plik nie został znaleziony!");
        }
    }
}