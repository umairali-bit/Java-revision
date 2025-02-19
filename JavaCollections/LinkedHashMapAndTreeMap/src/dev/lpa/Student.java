package dev.lpa;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

record Course (String courseId, String name, String subject) {}

record purchase (String courseId, int studentId, double price, int yr, int dayOfYear) {

    public LocalDate purchaseDate() {
        return LocalDate.ofYearDay(yr, dayOfYear);
    }
}

public class Student {

    public static int lastId = 10001;
    public static int serialNo = 1;

    private String name;
    private int id;
    private List<Course> courseList;
    private int serial;

    public Student(String name, List<Course> courseList) {
        this.name = name;
        this.courseList = courseList;
        id = lastId++;
        serial = serialNo++;


    }

    public Student(String name, Course course) { // to create a student with just course
        this(name, new ArrayList<>(List.of(course)));

    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void addCourse (Course course) {
        courseList.add(course);
    }

    @Override
    public String toString() {
        String[] courseNames = new String[courseList.size()]; //add course names to the list
        Arrays.setAll(courseNames, i -> courseList.get(i).name()); // to get the list of the courses
        return "[%d] : %s".formatted(id, String.join(", ", courseNames));
    }
}
