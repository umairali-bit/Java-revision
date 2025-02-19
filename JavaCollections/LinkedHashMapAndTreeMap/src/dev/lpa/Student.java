package dev.lpa;

import java.time.LocalDate;

record Course (String courseId, String name, String subject) {}

record purchase (String courseId, int studentId, double price, int yr, int dayOfYear) {

    public LocalDate purchaseDate() {
        return LocalDate.ofYearDay(yr, dayOfYear);
    }
}

public class Student {


}
