package dev.lpa;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

        var result = IntStream
                .iterate(0, i -> i <= 1000, i -> i + 10)
                .summaryStatistics();
        System.out.println("Result = " + result );


        var leapYear = IntStream
                .iterate(2000, i -> i <= 2025, i -> i + 1)
                .filter(i -> i % 4 == 0)
                .peek(i -> System.out.print(i + " "))
                .summaryStatistics();
        System.out.println("\nLeap Year Data = " + leapYear);

        Seat[] seats = new Seat[100];
        Arrays.setAll(seats, i -> new Seat((char) ('A' + i / 10), i % 10 + 1));
//        Arrays.asList(seats).forEach(i -> System.out.println(i));


        long reservationCount = Arrays
                .stream(seats)
                .filter(i -> i.isReserved())
                .count();
        System.out.println("reservationCount = " + reservationCount);

        boolean hasBookings = Arrays
                .stream(seats)
                .anyMatch(i -> i.isReserved());
        System.out.println("hasBookings = " + hasBookings);





    }
}
