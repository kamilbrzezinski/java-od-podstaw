package org.example;

public class SpecialCharactersPasswordValidator implements PasswordValidator {
    @Override
    public boolean validate(String password) {
        if (password.contains("#") || password.contains("%")) {
            return true;
        } else {
            System.out.println("Hasło nie zawiera znaków specjalnych");
            return false;
        }
    }
}
