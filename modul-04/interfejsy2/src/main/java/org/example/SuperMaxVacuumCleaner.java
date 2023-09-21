package org.example;

public class SuperMaxVacuumCleaner implements VacuumCleaner {
    @Override
    public void displayBrand() {
        System.out.println("SuperMax");
    }

    @Override
    public void turnOnLights() {
        System.out.println();
    }

    @Override
    public void vacuum() {

    }
}
