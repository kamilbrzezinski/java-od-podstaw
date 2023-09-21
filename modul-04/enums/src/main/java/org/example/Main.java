package org.example;

public class Main {
    public static void main(String[] args) {
//        DaysOfWeek day = DaysOfWeek.MONDAY;
//
//        if (day == DaysOfWeek.MONDAY) {
//            System.out.println("To początek tygodnia!");
//        }

        RequestHandler requestHandler = new RequestHandler();
//        System.out.println(requestHandler.handleRequest());

//        StatusCode statusCode = requestHandler.handleRequest();
//        int code = statusCode.getCode();
//        System.out.println(code);
//        System.out.println(statusCode.name());

        StatusCode[] values = StatusCode.values();

        for (StatusCode value : values) {
            System.out.println(value);
        }
    }
}