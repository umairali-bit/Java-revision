package dev.lpa;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

public class Main {

    enum WeekDay {SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY}


    public static void main(String[] args) {

        //assgining workdays to different employees
        //setting up the list of the days that ann works

        List<WeekDay> annsWorkDays = new ArrayList<>(List.of(WeekDay.MONDAY,WeekDay.TUESDAY,
                                        WeekDay.THURSDAY, WeekDay.FRIDAY));

        //factory method to create a set of Ann's workdays.
        var annsDaysSet = EnumSet.copyOf(annsWorkDays);
        System.out.println(annsDaysSet.getClass().getSimpleName());
        annsDaysSet.forEach(System.out::println);

        //factory method allof
        var allDaysSet = EnumSet.allOf(WeekDay.class);
        System.out.println("-".repeat(30));
        allDaysSet.forEach(System.out::println);

        //factory method complementof will give the difference between annsDaySet and Weekdays
        Set<WeekDay> newPersonDays = EnumSet.complementOf(annsDaysSet);
        System.out.println("-".repeat(30));
        newPersonDays.forEach(System.out::println);



    }
}
