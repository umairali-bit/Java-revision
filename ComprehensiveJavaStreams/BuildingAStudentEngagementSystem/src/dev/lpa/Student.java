package dev.lpa;

import jdk.jshell.execution.LoaderDelegate;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Student {

    private static long lastStudentId = 1;

    private final static Random random = new Random();

    private final long studentId;

    private final String countryCode;

    private final int yearEnrolled;

    private final int ageEnrolled;

    private final String gender;

    private final boolean programmingExperience;

    private final Map<String, CourseEngagement> engagementMap = new HashMap<>();


    public Student(String countryCode, int yearEnrolled, int ageEnrolled,
                   String gender, boolean programmingExperience, Course... courses) { //varargs
        studentId = lastStudentId++;
        this.countryCode = countryCode;
        this.yearEnrolled = yearEnrolled;
        this.ageEnrolled = ageEnrolled;
        this.gender = gender;
        this.programmingExperience = programmingExperience;


        for (Course course : courses) {
            addCourse(course, LocalDate.of(yearEnrolled,1,1));
        }

    }

    //overloaded addCourse()
    public void addCourse(Course newCourse) {
        addCourse(newCourse, LocalDate.now());
    }
    //entry to the engagement map
    public void addCourse(Course newCourse, LocalDate enrollDate) {

        engagementMap.put(newCourse.courseCode(), new CourseEngagement(newCourse, enrollDate, "Enrollment"));
    }


    public long getStudentId() {
        return studentId;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public int getYearEnrolled() {
        return yearEnrolled;
    }

    public int getAgeEnrolled() {
        return ageEnrolled;
    }

    public String getGender() {
        return gender;
    }

    public boolean hasProgrammingExperience() {
        return programmingExperience;
    }

    public Map<String, CourseEngagement> getEngagementMap() {
        return Map.copyOf(engagementMap); //defensive copy for map
    }

    public int getYearsSinceEnrolled() {
        return LocalDate.now().getYear() - yearEnrolled;
    }


}
