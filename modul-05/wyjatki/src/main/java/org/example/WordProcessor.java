package org.example;

public class WordProcessor {
    private final String word;

    public WordProcessor(String word) {
        this.word = word;
    }

    public String stripAndCapitalize() {
        return word.strip().toUpperCase();
    }
}
