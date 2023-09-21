package org.example;

public class Main {
    public static void main(String[] args) {
        String name = "Kamil";
        String name2 = "Kamil";
        String name3 = new String("Kamil");
        String name4 = name3.intern();

//        System.out.println(name == name2);
//        System.out.println(name == name3);
        System.out.println(name == name4);
    }
}