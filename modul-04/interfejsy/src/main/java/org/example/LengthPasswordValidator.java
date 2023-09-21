package org.example;

public class LengthPasswordValidator implements PasswordValidator {
    @Override
    public boolean validate(String password) {
        if (password.length() > 8) {
            return true;
        } else {
            System.out.println("Hasło jest za krótkie!");
            return false;
        }
    }
}
