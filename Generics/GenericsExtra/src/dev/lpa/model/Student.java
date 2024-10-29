package dev.lpa.model;

import java.util.ArrayList;
import java.util.Random;

public class Student {


    // fields name, course, yearStarted

    private String name;
    private String course;
    private int yearStarted;
    private int sequence;

    //random data
    protected static Random random = new Random();

    private static String[] firstNames = {"Ann", "Bill", "Cathy", "John", "Tim"};
    private static String[] courses = {"C++", "Java", "Python"};

    //constructor
    public Student() {
        int  lastNameIndex = random.nextInt(65,91); //65 is A and 91 is Z
        name = firstNames[random.nextInt(5)] + " " + (char) lastNameIndex;
        course = courses[random.nextInt(3)];
        yearStarted = random.nextInt(2018, 2023);
       

    }

    @Override
    public String toString() {
        return "%-15s %-15s %d".formatted(name, course, yearStarted);
    }

    public int getYearStarted() {
        return yearStarted;
    }
}
