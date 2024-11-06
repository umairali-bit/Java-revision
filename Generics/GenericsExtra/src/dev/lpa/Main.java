package dev.lpa;

import dev.lpa.model.LPAStudent;
import dev.lpa.model.Student;

import java.util.ArrayList;
import java.util.List;

public class Main {



    public static void main(String[] args) {

        int studentCount = 10;

        //List<Student> students = new ArrayList<>();


        List<LPAStudent> lpaStudents = new ArrayList<>();

        for (int i = 0; i < studentCount; i++) {
            lpaStudents.add(new LPAStudent());
        }

        //printList(students);

        printMoreLists(lpaStudents);


        testList(new ArrayList<String>(List.of("Able", "Barry", "Charlie")));
        testList(new ArrayList<Integer>(List.of(1,2,3)));
    }



    //static method to print students
    public static void printMoreLists(List<? extends Student>  students) { // raw version of generics (List students)

            for (var student: students) {
                System.out.println(student.getYearStarted() + ":" + student );
            }
    }

    public static void testList(List <?> list) { //type earsure handeling example
        for (var element : list) {
            if (element instanceof String s) {
                System.out.println("String: " + s.toUpperCase());
            } else if (element instanceof Integer i) {
                System.out.println("Integer: " + i.floatValue());
            }
        }
    }


    //    public static void testList (List<String> list) {
//
//        for (var element : list) {
//            System.out.println("String: " + element.toUpperCase());
//
//        }
//    }
//
//    public static void testList (List<Integer> list) {
//
//        for (var element : list) {
//            System.out.println("Integer: " + element.floatValue());
//
//        }
//    }


    //static generic method to print students
//    public static <T extends Student> void printList(List<T>  students) { // raw version of generics (List students)
//
//
//
//        for (var student: students) {
//
//
//            System.out.println(student.getYearStarted() + ":" + student );
//
//        }
//
//
//    }







    }



