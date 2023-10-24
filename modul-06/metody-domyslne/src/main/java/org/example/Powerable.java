package org.example;

public interface Powerable {
    void powerOn();
    void powerOff();
    default String getVersion() {
        return "DOMYŚLNA WERSJA - INTERFEJS POWERABLE";
    }
}
