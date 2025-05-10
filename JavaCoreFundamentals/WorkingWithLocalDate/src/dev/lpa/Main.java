package dev.lpa;

import java.time.LocalDate;
import java.time.Month;

public class Main {

    public static void main(String[] args) {

//        getting todays date
        LocalDate today = LocalDate.now();
        System.out.println(today);

//        Dates in other formats
//        2025-05-05
        LocalDate five5 = LocalDate.of(2025, 5,5);
        System.out.println(five5);

//        2025-05-05
        LocalDate May5th = LocalDate.of(2025, Month.MAY, 5);
        System.out.println(May5th);

//        getting the date by passing year and day of the year
        LocalDate Day125 = LocalDate.ofYearDay(2025, 125);
        System.out.println(Day125);






    }
}
