package org.example;

public class StringManipulator {
    public String reverseString(String text) {
        return new StringBuilder(text).reverse().toString();
    }
}
