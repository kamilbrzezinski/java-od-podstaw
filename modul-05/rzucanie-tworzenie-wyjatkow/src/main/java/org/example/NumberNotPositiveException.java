package org.example;

public class NumberNotPositiveException extends RuntimeException {
    public NumberNotPositiveException() {
    }

    public NumberNotPositiveException(String message) {
        super(message);
    }
}
