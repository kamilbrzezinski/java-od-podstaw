package pl.programujodpodstaw.usbdevice;

public interface USBDevice {
    boolean connect();
    boolean disconnect();
    String getName();
}
