package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        User user = new User();

        PasswordValidator validator = new LengthPasswordValidator();
//        PasswordValidator validator2 = new SpecialCharactersPasswordValidator();
        validator = new SpecialCharactersPasswordValidator();

        List<String> users = new ArrayList<>();

        user.setPassword("hasło", validator);
    }
}