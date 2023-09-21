package pl.programujodpodstaw;

import pl.programujodpodstaw.drive.Drive;
import pl.programujodpodstaw.drive.HDDDrive;
import pl.programujodpodstaw.drive.SSDDrive;
import pl.programujodpodstaw.file.File;
import pl.programujodpodstaw.file.image.GIFImageFile;
import pl.programujodpodstaw.file.image.JPGImageFile;
import pl.programujodpodstaw.file.music.MP3File;
import pl.programujodpodstaw.usbdevice.MemoryStick;
import pl.programujodpodstaw.usbdevice.Mouse;
import pl.programujodpodstaw.usbdevice.USBDevice;

import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Monitor monitor = new Monitor("Dell");
//        Drive ssdDrive = new SSDDrive();
//
//        Computer computer = new Computer(monitor, ssdDrive);
//        ssdDrive.addFile(new File("photo.jpg"));
//        ssdDrive.listFiles();
//        computer.addFile(new File("file.png"));
//        computer.listFiles();
//        Mouse mouse = new Mouse("Mysz");
//        MemoryStick memoryStick = new MemoryStick("Pendrive");
//
//        computer.addUSBDevice(mouse);
//        computer.addUSBDevice(memoryStick);
//
//        computer.removeUSBDevice(mouse);
//
//        memoryStick.eject();
//        computer.removeUSBDevice(memoryStick);

//        List<USBDevice> usbDevices = computer.getUsbDevices();
//
//        for (USBDevice device : usbDevices) {
//            System.out.println(device.getName());
//        }
        MP3File mp3File = new MP3File("audio.mp3", 4000,
                "Rammstein", "Sonne", 100);

        GIFImageFile gifImageFile = new GIFImageFile("funnydog.gif", 150);
        JPGImageFile jpgImageFile = new JPGImageFile("holidays.jpg", 400, 80);

        Monitor monitor = new Monitor("Dell");
        Drive ssdDrive = new HDDDrive();

        Computer computer = new Computer(monitor, ssdDrive);
        computer.addFile(mp3File);
        computer.addFile(gifImageFile);
        computer.addFile(jpgImageFile);

        File file = computer.findFile("audio.mp3");
        System.out.println(file.getSize());
        System.out.println(file.getName());
        System.out.println(file);
    }
}