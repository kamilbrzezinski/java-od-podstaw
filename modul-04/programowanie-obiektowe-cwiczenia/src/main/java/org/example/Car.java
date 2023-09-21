package org.example;

public class Car {
    private final String make;
    private final String model;
    private final int year;
    private String color;
    private int mileage;
    private final int maxSpeed;
    protected int range;
    private final int maxRange;

    public Car(String make, String model, int year, String color, int maxSpeed, int range) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.range = range;
        this.maxRange = range;
    }

    public Car(String make, String model, String color, int maxSpeed, int range) {
        this(make, model, 2023, color, maxSpeed, range);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getMileage() {
        return mileage;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getRange() {
        return range;
    }

    public void drive(int distance) {
        if (range - distance >= 0) {
            mileage += distance;
            range -= distance;
        } else {
            System.out.println("Za mały zasięg, uzupełnij benzynę!");
        }
    }

    public void addFuel() {
        range = maxRange;
    }
}
