package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("src/main/resources/todo.txt");
        List<String> lines = Files.readAllLines(path);

        for (String line : lines) {
            System.out.println(line);
        }

        List<String> toDo = new ArrayList<>();
//        toDo.add("umyć lustro");
//        toDo.add("ugotować obiad");
        toDo.add("odkurzyć w mieszkaniu");
        Files.write(path, toDo, StandardOpenOption.WRITE);
    }
}