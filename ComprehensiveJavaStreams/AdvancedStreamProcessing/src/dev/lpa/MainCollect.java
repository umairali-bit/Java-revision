package dev.lpa;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainCollect {

    public static void main(String[] args) {

        Course pymc = new Course("PYMC", "Python MasterClass");
        Course jmc = new Course("JMC", "Java MasterClass");

//        List of Students randomly generated courses by using Stream.generate and Supplier
//        limit student to 1000
//        toList() to give a list of students in the order that they were created
//        get a set of American students

        List<Student> students = Stream.generate(() -> Student.getRandomStudent(pymc,jmc))
                .limit(1000)
                .toList();

        Set<Student> americanStudents = students.stream()
                .filter((s) -> s.getCountryCode().equals("US"))
                .collect(Collectors.toSet());
        System.out.println("# of American Students = " + americanStudents.size());




    }
}
