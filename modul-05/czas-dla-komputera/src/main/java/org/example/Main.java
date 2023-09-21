package org.example;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Main {
    public static void main(String[] args) {
        Instant now = Instant.now();
//        System.out.println(now);
//
//        LocalDateTime warsaw = LocalDateTime.ofInstant(now, ZoneId.of("Europe/Warsaw"));
//        LocalDateTime newYork = LocalDateTime.ofInstant(now, ZoneId.of("America/New_York"));
//
//        System.out.println(warsaw);
//        System.out.println(newYork);

//        System.out.println(now.getEpochSecond());
        Instant instant = Instant.ofEpochSecond(1693914338);
        System.out.println(instant);
    }
}