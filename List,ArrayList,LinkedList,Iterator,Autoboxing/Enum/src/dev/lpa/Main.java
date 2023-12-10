package dev.lpa;

import java.util.Locale;
import java.util.Random;

public class Main {

    public static void main(String[] args) {


        DayOfTheWeek weekDay = DayOfTheWeek.TUES;
        System.out.println(weekDay); //TUES

        System.out.printf("Name is %s, Ordinal Value = %d%n",
                weekDay.name(),weekDay.ordinal());    // Name is TUES, Ordinal Value = 2

        for(int i = 0; i<10; i++) {
            weekDay = getRandomDay();

           System.out.printf("Name is %s, Ordinal Value = %d%n",
                    weekDay.name(),weekDay.ordinal());

            if(weekDay == DayOfTheWeek.FRI) {
                System.out.println("Found a Friday!!!");
            }


        }

        System.out.println("-".repeat(30));

        for(int i = 0; i < 8; i++) {
            weekDay = getRandomDay();

            switchDayOfWeek(weekDay); // weekday is a reference to the enum, Thursday is Day 5
        }


        System.out.println("-".repeat(30));

        days();

        System.out.println("-".repeat(30));


        for(Topping topping : Topping.values()) {
            System.out.println(topping.name() + " : " + topping.getPrice());
        }



    }

    // creating a method that return days of the week from enum
    public static void days() {

        for(DayOfTheWeek days : DayOfTheWeek.values()) {
            System.out.println(days.name() + " : " + days.ordinal());
        }

    }

    // creating a method that returns a random day of the week
    public static DayOfTheWeek getRandomDay() {

        int randomInteger = new Random().nextInt(7);
        var allDays = DayOfTheWeek.values();

        return allDays[randomInteger];
    }


    public static void switchDayOfWeek (DayOfTheWeek weekDay) {
        int weekDayInteger = weekDay.ordinal() + 1; // the array will start from 1

        switch(weekDay) {
            case WED -> System.out.println("Wednesday is Day " + weekDayInteger);
            case SAT -> System.out.println("Saturday is Day " + weekDayInteger);
            default -> System.out.println(weekDay.name().charAt(0) + weekDay.name().substring(1).toLowerCase() +
                        "day is Day " + weekDayInteger);


            //weekDay.name().charAt(0) getting name and first character from enum
            //weekDay.name().substring(1) concatenating rest of the characters
        }
    }





}
