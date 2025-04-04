package dev.lpa;

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

    }
}
