package dev.lpa;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.*;
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

        System.out.println("-".repeat(30));

//        same map for only students aged 25 or under
        int minAge = 25;
        var youngerSet = students.stream()
                .collect(groupingBy(i -> i.getCountryCode(),
                        filtering(s -> s.getAge() <= minAge, toList())));

        youngerSet.forEach((k,v) -> System.out.println(k + " " + v.size()));

        System.out.println("-".repeat(30));


//        map that returns boolean values
        var experienced = students.stream()
                .collect(partitioningBy(i -> i.hasProgrammingExperience()));
        System.out.println("Experienced Students = " + experienced.get(true).size());


//        use of counting() on the Collectors class
        var expCount = students.stream()
                .collect(partitioningBy(i -> i.hasProgrammingExperience(), counting()));
        System.out.println("Experienced Students = " + expCount.get(true));


//        getting experienced and active students
        var experiencedAndActive = students.stream()
                .collect(partitioningBy(
                        i -> i.hasProgrammingExperience()
                        && i.getMonthsSinceActive() == 0,
                        counting()));
        System.out.println("Experienced and Active Students = " + experiencedAndActive.get(true));


//        getting a multi-level map

        var multiLevel = students.stream()
                .collect(groupingBy(i -> i.getCountryCode(),
                        groupingBy(i -> i.getGender())));

        multiLevel.forEach((key, value) -> {
            System.out.println(key);
            value.forEach((key1, value1) ->
            System.out.println("\t" + key1 + " " + value1.size()));
        });

//      counting students in map without using streams
        long studentBodyCount = 0;
        for (var list : experienced.values()) {
            studentBodyCount += list.size();
        }
        System.out.println("studentBodyCount = " + studentBodyCount);

//        counting students in map using streams without filtering
        studentBodyCount = experienced.values().stream()
                .mapToInt(l -> l.size())
                .sum();
        System.out.println("studentBodyCount = " + studentBodyCount);


//        map to stream, filtering getMonthsSinceActive()
        studentBodyCount = experienced.values().stream()
                .map(l -> l.stream()
                        .filter(i -> i.getMonthsSinceActive() <= 3)
                        .count())
                .mapToLong(l -> l)
                .sum();
        System.out.println("studentBodyCount = " + studentBodyCount);
















    }
}
