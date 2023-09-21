package org.example;

public enum StatusCode {
    NOT_FOUND(400),
    NOT_CREATED(300),
    NOT_AUTHORIZED(250),
    OK(0);

    private final int code;

    public int getCode() {
        return code;
    }

    StatusCode(int code) {
        this.code = code;
    }
}
