package dev.lpa;

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

    }

    // creating a method that returns a random day of the week

    public static DayOfTheWeek getRandomDay() {

        int randomInteger = new Random().nextInt(7);
        var allDays = DayOfTheWeek.values();

        return allDays[randomInteger];
    }




}
