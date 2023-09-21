package org.example;

public class PasswordValidator {
    public static boolean validatePassword(String password) {
        return password.length() > 8;
    }
}
