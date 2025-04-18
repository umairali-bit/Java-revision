package dev.lpa;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainCollect {

    public static void main(String[] args) {

        Course pymc = new Course("PYMC", "Python MasterClass");
        Course jmc = new Course("JMC", "Java MasterClass");

//        List of Students randomly generated courses by using Stream.generate and Supplier
//        limit student to 1000
//        toList() to give a list of students in the order that they were created
//        get a set of American students, returns a hashSet
//        another set of students who were enrolled under the age of 30
//        using large set of data in youngAmericans1
//        getting the same thing with youngAmericans2 using streams and incorporating comparator in it

        List<Student> students = Stream.generate(() -> Student.getRandomStudent(pymc,jmc))
                .limit(1000)
                .toList();
        System.out.println("# of Students = " + students.size());

        Set<Student> americanStudents = students.stream()
                .filter((s) -> s.getCountryCode().equals("US"))
                .collect(Collectors.toSet());
        System.out.println("# of American Students = " + americanStudents.size());

        Set<Student> underThirty = students.stream()
                .filter((s) -> s.getAgeEnrolled() < 30)
                .collect(Collectors.toSet());
        System.out.println("# of American Students under 30 = " + underThirty.size());


        Set<Student> youngAmericans1 = new TreeSet<>(Comparator.comparing(
                i -> i.getStudentId()));
        youngAmericans1.addAll(americanStudents);
        youngAmericans1.retainAll(underThirty);
        youngAmericans1.forEach((s) -> System.out.print(s.getStudentId() + " "));
        System.out.println();


        Set<Student> youngAmericans2 = students.stream()
                .filter(s -> s.getAgeEnrolled() < 30)
                .filter(s -> s.getCountryCode().equals("US"))
//                .collect(TreeSet::new, TreeSet::add, TreeSet::addAll);
                .collect(() -> new TreeSet<>(Comparator.comparing(i -> i.getStudentId())),
                        TreeSet::add, TreeSet::addAll);
        youngAmericans2.forEach(s -> System.out.print(s.getStudentId() + " "));
        System.out.println();



        String countryList = students.stream()
                .map(i -> i.getCountryCode())
                .distinct()
                .sorted()
                .reduce("", (r,v) -> r + " " + v);
        System.out.println("countryList = " + countryList);










    }
}
