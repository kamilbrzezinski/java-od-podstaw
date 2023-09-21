package org.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2023, 9, 5);
        System.out.println(date.getYear());
        System.out.println(date.getDayOfYear());
        System.out.println(date.getMonth());
        System.out.println(date.getDayOfWeek());
        System.out.println(date);

        LocalTime time = LocalTime.of(12, 0);
        System.out.println(time);

        LocalDateTime dateTime = LocalDateTime.of(2023, 9, 5, 12, 0);
        System.out.println(dateTime);

        System.out.println();
        LocalDate now = LocalDate.now();
        System.out.println(now);

        LocalDateTime now1 = LocalDateTime.now();
        System.out.println(now1);

        LocalDateTime newYorkNow = LocalDateTime.now(ZoneId.of("America/New_York"));
        System.out.println(newYorkNow);

//        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
//        for (String zoneId : availableZoneIds) {
//            System.out.println(zoneId);
//        }
    }
}