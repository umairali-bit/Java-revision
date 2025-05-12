package dev.lpa;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;

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

//        getting month and year
        LocalDate May5 = LocalDate.parse("2025-05-05");
        System.out.println(May5);

        System.out.println(May5.getYear());
        System.out.println(May5.getMonth());

//        getting the month value
        System.out.println(May5.getMonthValue());

//        use of getDayOf methods
        System.out.println(May5.getDayOfMonth());
        System.out.println(May5.getDayOfWeek());
        System.out.println(May5.getDayOfYear());

/*
        ChronoField implements temporalField - TemporalField is an interface
        for a class, that implements a date time field.

 */
        System.out.println(May5.get(ChronoField.YEAR));
        System.out.println(May5.get(ChronoField.MONTH_OF_YEAR));
        System.out.println(May5.get(ChronoField.DAY_OF_MONTH));
        System.out.println(May5.get(ChronoField.DAY_OF_YEAR));

//      with() - LocalDate Day125 = LocalDate.ofYearDay(2025, 125); not going to change
        System.out.println(May5.withYear(2000));
        System.out.println(May5.withMonth(3));
        System.out.println(May5.withDayOfMonth(4));
        System.out.println(May5.withDayOfYear(126));

//      we can also call chronofield in the with() constructor
        System.out.println(May5.with(ChronoField.DAY_OF_YEAR, 126));















    }
}
