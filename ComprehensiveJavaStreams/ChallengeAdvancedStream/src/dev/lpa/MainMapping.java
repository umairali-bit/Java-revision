package dev.lpa;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MainMapping {

    public static void main(String[] args) {


        Course pymc = new Course("PYMC", "Python MasterClass", 50);
        Course jmc = new Course("JMC", "Java MasterClass", 100);
        Course jgames = new Course ("JGame", "Creating Games in Java");

        List<Student> students = IntStream
                .rangeClosed(1, 5000)
                .mapToObj(s -> Student.getRandomStudent(jmc,pymc))
                .toList();

//        using list of students to create a Map
        var mappedStudents = students.stream()
                .collect(Collectors.groupingBy(i -> i.getCountryCode()));

        mappedStudents.forEach((k,v) -> System.out.println(k + " " + v.size()));

    }
}
