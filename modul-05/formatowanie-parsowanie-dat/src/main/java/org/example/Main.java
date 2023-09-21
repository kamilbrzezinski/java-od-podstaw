package org.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;

public class Main {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        String dateString = "10/09/2023 16:00";
        LocalDateTime parsedDateTime = LocalDateTime.parse(dateString, formatter);
        System.out.println(parsedDateTime);

        String dateString2 = "5th September 2023";
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("d'th' MMMM yyyy");
        LocalDate parsedDate = LocalDate.parse(dateString2, formatter1);
        System.out.println(parsedDate);

//        String formattedDateTime = now.format(formatter1);
//        System.out.println(formattedDateTime);
    }
}