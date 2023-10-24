package org.example;

public interface USBDevice {
    String VERSION = "3.0";

    static String getUSBVersion() {
        return "Wersja " + VERSION;
    }

    void connect();

    void disconnect();

    String getName();

    default String getVersion() {
        return "DOMYŚLNA WERSJA";
    }
}
