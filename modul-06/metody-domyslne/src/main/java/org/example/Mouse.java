package org.example;

public class Mouse implements USBDevice, Powerable {
    @Override
    public void connect() {
        System.out.println("Mysz podłączona");
    }

    @Override
    public void disconnect() {
        System.out.println("Mysz odłączona");
    }

    @Override
    public String getName() {
        return "Mysz";
    }

    @Override
    public String getVersion() {
        return "Mysz 1.0";
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
