package dev.lpa;

import java.sql.SQLOutput;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MainChallenge {

    /*
    Create a new class called MainChallenge, with a main method that does the following:
    Copy the two courses, jmc and pymc, from the MainCollect's main method, passing both an additional
    argument for the lecture count. 50 for pymc, and 100 for jmc.
    Add a third course, titled "Creating Games in Java".   You don't have to pass a lecture count for this one.
    Use Stream.generate or Stream.iterate to generate 5000 random students and create a list of these.
    Use the getPercentComplete method, to calculate the average percentage completed for all students for just the
    Java Masterclass, using reduce terminal operation.
    Use this result, multiplying it by 1.25, to collect a group of students (either as a list, or a set).
    These would be the students who've completed more than three quarters of that average percentage.
    Sort by the longest enrolled students who are still active, because you're going to offer your new course to 10 of
    these students, for a trial run.
    Add the new course to these ten students.
    Make one change to the Student's getRandomStudent method, using a minimum lecture of 30.

*/
    public static void main(String[] args) {

        Course pymc = new Course("PYMC", "Python MasterClass", 50);
        Course jmc = new Course("JMC", "Java MasterClass", 100);
        Course jgames = new Course ("JGame", "Creating Games in Java");


//        List<Student> students = Stream.generate(() -> Student.getRandomStudent(pymc,jmc,gamesJava))
//                .limit(5000)
//                .toList();
//
//        var result = students.stream()
//                .map(i -> i.getPercentComplete("JMC"))
//                .reduce(
//                        new double[] {0.0, 0.0}, //[sum, count]
//                        (acc, percent) -> new double[]{acc[0] + percent, acc[1] + 1}, //accumulator
//                        (a,b) -> new double[]{a[0] + b[0], a[1],b[1]}
//                );
//        double average = result[1] == 0 ? 0 :result[0] /result[1];
//
//        double threshold = 0.75 * average * 1.25;
//
//        Set<Student> topStudents = students.stream()
//                .filter(i -> i.getPercentComplete("JMC") > threshold)
//                .collect(Collectors.toSet());
//        System.out.println("average" + average);
//
//        System.out.println("Top Student count = " + topStudents.size());
//
//        Comparator<Student> longTerm = Comparator.comparing(i -> i.getAgeEnrolled());
//
//
//        students.stream()
//                .filter(i -> i.getPercentComplete("JMC") >= threshold)
//                .sorted(longTerm)
//                .limit(10)
//                .toList()
//                .forEach(s -> {
//                    s.addCourse(gamesJava);
//                    System.out.print(s.getStudentId() + " ");
//                });



//        List<Student> students = Stream.iterate(1, s -> s <= 500, s-> s + 1)
//                .map(s -> Student.getRandomStudent(jmc,pymc))
//                .toList();

        List<Student> students = IntStream
                .rangeClosed(1, 5000)
                .mapToObj(s -> Student.getRandomStudent(jmc,pymc))
                .toList();

/*
        Use the getPercentComplete method, to calculate the average percentage completed for all students for just the
        Java Masterclass, using reduce terminal operation.

*/
        double totalPercent = students.stream()
                .mapToDouble(s -> s.getPercentComplete("JMC"))
//              .sum()
                .reduce(0, (a,b) -> a +b);

        double avePercent = totalPercent / students.size();
        System.out.printf("Average Percentage Complete = %.2f%% %n", avePercent);


        int topPercent = (int) (1.25 * avePercent);
        System.out.printf("Best Percentage Complete = %d%% %n", topPercent);


        List<Student> hardWorkers = students.stream()
                .filter(s -> s.getMonthsSinceActive("JMC") == 0)
                .filter(s -> s.getPercentComplete("JMC") >= topPercent)
                .toList();
        System.out.println("hardworkers = " + hardWorkers.size());





















    }

}
