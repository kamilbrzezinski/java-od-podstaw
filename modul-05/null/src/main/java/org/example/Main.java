package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        User user = new User();
//        System.out.println(user.getName());
//        System.out.println(user.getLastName());
//        System.out.println(user.getAge());

//        ArrayList<String> names = null;
//        int age = null;

//        User user = new User("Kamil", null, 35);
        User user1 = new User("Paulina", null, 31);

        Users users = new Users();
//        users.addUser(user);
        users.addUser(user1);

        User firstMaleUser = users.getFirstMaleUser();
        System.out.println(firstMaleUser.getName().toLowerCase());
//        System.out.println(user.getName());
//        System.out.println(user.getLastName());
    }
}