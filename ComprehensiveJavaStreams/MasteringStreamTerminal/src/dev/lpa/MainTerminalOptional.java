package dev.lpa;

import java.util.List;
import java.util.stream.Stream;

public class MainTerminalOptional {

    public static void main(String[] args) {


        Course pymc = new Course("PYMC", "Python MasterClass");
        Course jmc = new Course("JMC", "Java Masterclass");

        List<Student> students =
                Stream.generate(() -> Student.getRandomStudent(jmc,pymc))
                        .limit(1000)
                        .toList();


        int minAge = 21;


        //     use of findAny
        students.stream()
                .filter(i -> i.getAge() <= minAge)
                .findAny()
                .ifPresentOrElse(s -> System.out.printf("Student %d from %s is %d%n",
                       s.getStudentId(),s.getCountryCode(),s.getAge()),
                        () -> System.out.println("Did not find anyone under " + minAge));

//      findFirst()
        students.stream()
                .filter(i -> i.getAge() <= minAge)
                .findFirst()
                .ifPresentOrElse(s -> System.out.printf("Student %d from %s is %d%n",
                                s.getStudentId(),s.getCountryCode(),s.getAge()),
                        () -> System.out.println("Did not find anyone under " + minAge));
    }
}
