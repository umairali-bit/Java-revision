package dev.lpa;

import dev.lpa.model.Student;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        int studentCount = 10;

        List<Student> students = new ArrayList<>();
        List<Integer> numbers = new ArrayList(studentCount);


            for (int i = 0; i < studentCount; i++) {

                students.add(new Student());
            }



        printList(students);

    }



    //static method to print students
    public static void printList(List<Student> students) {

        for (var student : students) {
            System.out.println(student);
        }
        System.out.println();

    }


}
