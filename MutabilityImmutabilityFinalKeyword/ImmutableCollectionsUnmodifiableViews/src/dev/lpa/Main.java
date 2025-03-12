package dev.lpa;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        StringBuilder bobsNotes = new StringBuilder();
        StringBuilder billsNotes = new StringBuilder("Bill struggles with generics");


        Student bob = new Student("Bob", bobsNotes);
        Student bill = new Student("Bill", billsNotes);
       // Student babe = new Student("Babe", babesNotes);

        List<Student> students = new ArrayList<>(List.of(bob,bill));

        //creating a copy of students list by passing the previous list to it
        List<Student> studentsFirstCopy = new ArrayList<>(students);
        studentsFirstCopy.add(new Student( " Bonnie", new StringBuilder()));
        StringBuilder bonnieNotes = studentsFirstCopy.get(2).getStudentNotes();
        bonnieNotes.append("Bonnie is taking 3 of my courses");

        bobsNotes.append("Bob was one of my students. ");

        students.forEach(System.out::println);
        System.out.println("-".repeat(30));
        studentsFirstCopy.forEach(System.out::println);
        System.out.println("-".repeat(30));





    }
}
