package org.example;

public class Keyboard implements USBDevice, Powerable {
    @Override
    public void connect() {
        System.out.println("Podłączono klawiaturę");
    }

    @Override
    public void disconnect() {
        System.out.println("Odłączono klawiaturę");
    }

    @Override
    public String getName() {
        return "Klawiatura";
    }

    @Override
    public String getVersion() {
        return "Klawiatura 1.0";
    }

    @Override
    public void powerOn() {
        System.out.println("Włączam zasilanie");
    }

    @Override
    public void powerOff() {
        System.out.println("Wyłączam zasilanie");
    }
}
