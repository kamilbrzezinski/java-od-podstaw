package org.example;

import java.util.Optional;

public class Computer {
    private Optional<Drive> drive;

    public Computer(Drive drive) {
        this.drive = Optional.ofNullable(drive);
    }

    public Optional<Drive> getDrive() {
        return drive;
    }

    public void setDrive(Drive drive) {
        this.drive = Optional.ofNullable(drive);
    }
}
