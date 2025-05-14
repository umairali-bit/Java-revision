package dev.lpa;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

import static java.time.LocalTime.now;

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
        LocalDate May5 = LocalDate.parse("2022-05-05");
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

//      plus methods
        System.out.println(May5.plusYears(1));
        System.out.println(May5.plusMonths(12));
        System.out.println(May5.plusDays(365));
        System.out.println(May5.plusWeeks(52));
        System.out.println(May5.plus(365, ChronoUnit.DAYS));

//      minus methods - isAfter(), isBefore(), compareTo(),equals()
        System.out.println("May5 > today? " + May5.isAfter(today)); //May5 > today? false
        System.out.println("today > May5? " + May5.isBefore(today));//today > May5? true
        System.out.println("May5 > today? " + May5.compareTo(today));//May5 > today? -7
        System.out.println("today > May5? " + today.compareTo(May5));//today > May5? 7
        System.out.println("today = now ? " + today.compareTo(LocalDate.now()));//today = now ? 0
        System.out.println("today = now ? " + today.equals(LocalDate.now()));

//      isLeapYear()
        System.out.println(today.isLeapYear());//false
        System.out.println(May5.minusYears(2).isLeapYear());//true

//      datesUntil()
        System.out.println("-".repeat(30));
        May5.datesUntil(May5.plusDays(7))
                .forEach(System.out::println);

//      overloaded() of datesUntil
        System.out.println("-".repeat(30));
        May5.datesUntil(May5.plusYears(1), Period.ofDays(7))
                .forEach(System.out::println);

//      local time
        LocalTime time = now();
        System.out.println(time);//15:23:33.835022

//      hours and minutes
        LocalTime threePM = LocalTime.of(3, 0);
        System.out.println(threePM);

//      hours and minutes and seconds
        LocalTime threeTwenty = LocalTime.of(3,25,20);
        System.out.println(threeTwenty);


//      nanoSeconds - 0 in the output means that its AM and 1 means PM
        LocalTime threeAM = LocalTime.parse("03:00");
        LocalTime threeThirtyAM = LocalTime.parse("03:30:15.1000");
        System.out.println(threeAM.get(ChronoField.AMPM_OF_DAY));
        System.out.println(threeThirtyAM.get(ChronoField.AMPM_OF_DAY));

        System.out.println(threeAM.getHour());
        System.out.println(threeAM.get(ChronoField.HOUR_OF_DAY));

        System.out.println(threeThirtyAM.plus(24, ChronoUnit.HOURS));

//      valid range of hours, minutes and seconds
        System.out.println(threeAM.range(ChronoField.HOUR_OF_DAY));
        System.out.println(threeAM.range(ChronoField.MINUTE_OF_HOUR));
        System.out.println(threeAM.range(ChronoField.MINUTE_OF_DAY));
        System.out.println(threeAM.range(ChronoField.SECOND_OF_MINUTE));
        System.out.println(threeAM.range(ChronoField.SECOND_OF_DAY));


//      Local Date and Local time
        LocalDateTime todayAndNow = LocalDateTime.now();
        System.out.println(todayAndNow);

//      Local date and time with year, month, dayOfMonth, hour, and minutes with in 2 formats
        LocalDateTime May5Noon = LocalDateTime.of(2022, 5, 5,12,0);
        System.out.printf("%tD %tr %n", May5Noon, May5Noon); // 05/05/22 12:00:00 PM
        System.out.printf("%1$tF %1$tT %n", May5Noon);// 2022-05-05 12:00:00

//       Built in date and time formats
        System.out.println(todayAndNow.format(DateTimeFormatter.ISO_WEEK_DATE));//2025-W20-3

        DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        System.out.println(May5Noon.format(dtf));//Thursday, May 5, 2022

        System.out.println(May5Noon.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)));//May 5, 2022, 12:00:00 PM


//      LocalDateTime with plusHour()
        LocalDateTime may6Noon = May5Noon.plusHours(24);
        System.out.println(may6Noon.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)));//May 6, 2022, 12:00:00 PM

























    }
}
