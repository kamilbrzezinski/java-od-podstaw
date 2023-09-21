package org.example;

public class ElectricCar extends Car {
    public ElectricCar(String make, String model, int year, String color, int maxSpeed, int range) {
        super(make, model, year, color, maxSpeed, range);
    }

    public ElectricCar(String make, String model, String color, int maxSpeed, int range) {
        super(make, model, color, maxSpeed, range);
    }

    public void chargeBattery() {

    }
}
