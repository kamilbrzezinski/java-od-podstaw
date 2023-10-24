package org.example;

import java.util.Optional;

public class Drive {
    private Optional<String> name;
    private final int sizeInTerabytes;

    public Drive(String name, int sizeInTerabytes) {
        this.name = Optional.ofNullable(name);
        this.sizeInTerabytes = sizeInTerabytes;
    }

    public Optional<String> getName() {
        return name;
    }

    public void setName(String name) {
        this.name = Optional.ofNullable(name);
    }

    public int getSizeInTerabytes() {
        return sizeInTerabytes;
    }
}
