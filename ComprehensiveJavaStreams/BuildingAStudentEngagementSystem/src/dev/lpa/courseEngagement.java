package dev.lpa;

/*
Each student will have a course engagement instance, for every course they're enrolled in.
It should have the fields for the course, the enrollment date, the engagement type, the last lecture, and the last activity date.
It should have the usual getters, plus getters for calculated fields as shown here.
The getMonthsSinceActive method should return the months elapsed, since the last course activity.

 */

import java.time.LocalDate;

public class courseEngagement {

    private final Course course;
    private final LocalDate enrollmentDate;
    private final String engagementType;
    private int lastLecture;
    private final LocalDate lastActivityDate;


    public courseEngagement(Course course, LocalDate enrollmentDate, String engagementType) {
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
}
