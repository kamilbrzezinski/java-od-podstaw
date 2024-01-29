package pl.programujodpodstaw;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        DatabaseService databaseService = new DatabaseService("jdbc:mysql://localhost:3306/java_od_podstaw", "root", "kamil");

        List<User> allUsers = databaseService.getAllUsers();
        allUsers.forEach(System.out::println);
    }
}