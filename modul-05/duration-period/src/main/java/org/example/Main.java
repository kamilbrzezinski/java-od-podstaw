package org.example;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        LocalDateTime newDateTime3 = now.plusDays(2);
        System.out.println(newDateTime3);

//        Duration durationOf10Minutes = Duration.ofMinutes(10);

//        LocalDateTime newDateTime = now.plus(durationOf10Minutes);
//        Period periodOfOneDay = Period.ofDays(1);
//        LocalDateTime newDateTime2 = now.plus(periodOfOneDay);
//        System.out.println(newDateTime2);

//        LocalDateTime pastDateTime = LocalDateTime.of(2023, 9, 5, 12, 0);

//        Duration duration = Duration.between(pastDateTime, now);
//        System.out.println(duration.getSeconds());
//
//        LocalDate nowDate = LocalDate.now();
//        LocalDate pastDate = LocalDate.of(2023, 9, 4);

//        Duration duration2 = Duration.between(pastDate, nowDate);
//        System.out.println(duration2.getSeconds());

//        Period period = Period.between(pastDate, nowDate);
//        System.out.println(period.getDays());
    }
}