package dev.lpa;

import java.util.List;
import java.util.stream.Stream;

public class MainOptional {


    public static void main(String[] args) {

        Course pymc = new Course("PYMC", "Python MasterClass");
        Course jmc = new Course("JMC", "Java MasterClass");

        List<Student> students = Stream.generate(() -> Student.getRandomStudent(pymc,jmc))
                .limit(1000)
                .toList();

    }
}
