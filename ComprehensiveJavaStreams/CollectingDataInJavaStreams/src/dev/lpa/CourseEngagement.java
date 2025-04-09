package dev.lpa;

/*
Each student will have a course engagement instance, for every course they're enrolled in.
It should have the fields for the course, the enrollment date, the engagement type, the last lecture, and the last activity date.
It should have the usual getters, plus getters for calculated fields as shown here.
The getMonthsSinceActive method should return the months elapsed, since the last course activity.

 */

import java.time.LocalDate;
import java.time.Period;

public class CourseEngagement {

    private final Course course;
    private final LocalDate enrollmentDate;
    private String engagementType;
    private int lastLecture;
    private LocalDate lastActivityDate;


    public CourseEngagement(Course course, LocalDate enrollmentDate, String engagementType) {
        this.course = course;
        this.enrollmentDate = this.lastActivityDate = enrollmentDate;
        this.engagementType = engagementType;
    }

    public String getCourseCode() {
        return course.courseCode();
    }

    public int getEnrollmentYear() {
        return enrollmentDate.getYear();
    }

    public String getEngagementType() {
        return engagementType;
    }

    public int getLastLecture() {
        return lastLecture;
    }

    public int getLastActivityYear() {
        return lastActivityDate.getYear();
    }


    //getter for month
    public String getLastActivityMonth() {
        return "%tb".formatted(lastActivityDate);
    }

    //getter for percentage
    public double getPercentageComplete() {
        return lastLecture * 100.0 / course.lectureCount();
    }

    //getMonthsSinceActive()
    public int getMonthsSinceActive() {

        LocalDate now = LocalDate.now();
        var months = Period.between(lastActivityDate, now).toTotalMonths();
        return (int) months;
    }


    void watchLecture (int lectureNumber, LocalDate currentDate) {

        lastLecture = Math.max(lectureNumber, lastLecture);
        lastActivityDate = currentDate;
        engagementType = "Lecture " + lastLecture;
    }

    @Override
    public String toString() {
        return "%s: %s %d %s [%d]".formatted(course.courseCode(),
                getLastActivityMonth(), getLastActivityYear(), engagementType, getMonthsSinceActive());
    }
}
