package org.example;

public class User {
    public void setPassword(String password, PasswordValidator validator) {
        validator.validate(password);
    }
}
