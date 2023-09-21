package org.example;

public class Main {
    public static void main(String[] args) {
        ProDustCleaner proDustCleaner = new ProDustCleaner();
        TurboMaxDustCleaner turboMaxDustCleaner = new TurboMaxDustCleaner();

        proDustCleaner.chargeBattery();
        turboMaxDustCleaner.chargeBattery();
    }
}