package org.example;

public class Main {
    public static void main(String[] args) {
        Mouse mouse = new Mouse();
        Keyboard keyboard = new Keyboard();

        System.out.println(USBDevice.getUSBVersion());
    }
}