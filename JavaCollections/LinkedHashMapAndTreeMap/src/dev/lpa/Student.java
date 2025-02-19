package dev.lpa;

import java.time.LocalDate;
import java.util.List;

record Course (String courseId, String name, String subject) {}

record purchase (String courseId, int studentId, double price, int yr, int dayOfYear) {

    public LocalDate purchaseDate() {
        return LocalDate.ofYearDay(yr, dayOfYear);
    }
}

public class Student {

    public static int lastId = 1;

    private String name;
    private int id;
    private List<Course> courseList;
    private int serialNo;

    


}
