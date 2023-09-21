package org.example;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class Main {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println(now);

        LocalDate nextOrSameTuesday = now.with(TemporalAdjusters.lastDayOfYear());
        System.out.println(nextOrSameTuesday);
    }
}