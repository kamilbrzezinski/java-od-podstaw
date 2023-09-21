package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class NamesReader {
    private final String filePath;

    public NamesReader(String filePath) {
        this.filePath = filePath;
    }

    public void printAllNames() throws IOException {
        Path path = Paths.get(filePath);

        List<String> lines = Files.readAllLines(path);

        for (String line : lines) {
            System.out.println(line);
        }


    }
}
