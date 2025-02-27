package dev.lpa;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

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





    }
}
