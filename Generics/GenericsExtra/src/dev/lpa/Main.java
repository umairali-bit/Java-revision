package dev.lpa;

import dev.lpa.model.LPAStudent;
import dev.lpa.model.Student;

import java.util.ArrayList;
import java.util.List;

public class Main {



    public static void main(String[] args) {

        int studentCount = 10;

        //List<Student> students = new ArrayList<>();


//


        List<LPAStudent> lpaStudents = new ArrayList<>();


        for (int i = 0; i < studentCount; i++) {
            lpaStudents.add(new LPAStudent());
        }






        //printList(students);

        printList(lpaStudents);

    }



    //static method to print students
    public static void printList(List  students) {



            for (var student: students) {


                System.out.println(student);

            }


    }




    }



