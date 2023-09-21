package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {

    private static final String RESOURCES = "src/main/resources/";

    public static void main(String[] args) {
        Path inputPath = Paths.get(RESOURCES + args[0]);
        Path outputPath = Paths.get(RESOURCES + args[1]);
        List<String> namesStartingWithA = new ArrayList<>();

        try {
            List<String> inputLines = Files.readAllLines(inputPath);

            for (String line : inputLines) {
                if (line.startsWith("A")) {
                    namesStartingWithA.add(line);
                }
            }
        } catch (IOException e) {
            System.out.println("Błąd podczas przetwarzania pliku wejściowegoS");
            throw new RuntimeException(e);
        }

        try {
            Files.write(outputPath, namesStartingWithA);
        } catch (IOException e) {
            System.out.println("Błąd podczas przetwarzania pliku wyjściowego");
            throw new RuntimeException(e);
        }
    }
}