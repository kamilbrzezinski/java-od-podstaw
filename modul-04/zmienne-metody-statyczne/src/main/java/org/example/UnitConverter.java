package org.example;

public class UnitConverter {
    private static final double METER_TO_FOOT = 3.28084;

    public static double metersToFeet(double meters) {
        return meters * METER_TO_FOOT;
    }
}
