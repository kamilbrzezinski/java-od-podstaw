package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Path path = Paths.get("src/main/resources/quiz.txt");
        List<String> lines = Files.readAllLines(path);
        int points = 0;

        for (String line : lines) {
            String[] questionAndAnswers = line.split(";");
            System.out.println(questionAndAnswers[0]);
            System.out.println("1. " + questionAndAnswers[1]);
            System.out.println("2. " + questionAndAnswers[2]);
            System.out.println("3. " + questionAndAnswers[3]);
            System.out.println("4. " + questionAndAnswers[4]);
            System.out.println();
            System.out.println("Którą odpowiedź wybierasz? ");
            int answer = scanner.nextInt();

            if (answer == Integer.parseInt(questionAndAnswers[5])) {
                System.out.println("To prawidłowa odpowiedź!");
                points++;
            } else {
                System.out.println("Niestety to błędna odpowiedź!");
                int correctAnswer = Integer.parseInt(questionAndAnswers[5]); // 2
                System.out.println("Prawidłowa odpowiedź to " + correctAnswer + " - " + questionAndAnswers[correctAnswer]);
            }

            System.out.println();
        }

        System.out.println("Twoja liczba punktów to " + points);
    }
}