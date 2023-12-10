package dev.lpa;

public class Main {

    public static void main(String[] args) {


        DayOfTheWeek weekDay = DayOfTheWeek.TUES;
        System.out.println(weekDay); //TUES

        System.out.printf("Name is %s, Ordinal Value = %d%n",
                weekDay.name(),weekDay.ordinal());    // Name is TUES, Ordinal Value = 2



    }

    




}
