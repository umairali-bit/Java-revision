package dev.lpa;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


/*
Set up three or four courses, using the lecture count version of the constructor on several of these, to pass lecture counts greater than 40.
Generate a list of 10,000 students who've enrolled in the past 4 years.
Pass the Supplier Functional Interface code three or four courses.

 */

public class StreamSectionChallenge {


    public static void main(String[] args) {

        Course pymc = new Course("PYMC", "Python MasterClass", 50);
        Course jmc = new Course("JMC", "Java MasterClass", 100);
        Course jgames = new Course("JGame", "Creating Games in Java");

        int currentYear = LocalDate.now().getYear();
        List<Student> students = Stream
                .generate(() -> Student.getRandomStudent(jmc, pymc, jgames))
                .filter(s -> s.getYearEnrolled() >= (currentYear - 4))
                .limit(10000)
                .toList();

//        System.out.println();

//            passing student stream to sout
        System.out.println(students
                .stream()
                .mapToInt(Student::getYearEnrolled)
                .summaryStatistics());

        students.subList(0, 10).forEach(System.out::println);


//        how many courses each student is taking
        System.out.println(students
                .stream()
                .mapToInt(s -> s.getEngagementMap().size())
                .summaryStatistics());


//        how many students are in each course
        var mappedActivity = students.stream()
                .flatMap(s -> s.getEngagementMap().values().stream())
                .collect(Collectors.groupingBy(i -> i.getCourseCode(),
                        Collectors.counting()));

        mappedActivity.forEach((k,v) -> System.out.println(k + " " + v));


//        Count of students taking 1, 2 or 3 courses
        var classCounts = students.stream()
                .collect(Collectors.groupingBy(i -> i.getEngagementMap().size(),
                        Collectors.counting()));


        classCounts.forEach((k,v) -> System.out.println(k + " " + v));



//        Average percent complete of each course
        var percentages = students.stream()
                .flatMap(s -> s.getEngagementMap().values().stream())
                .collect(Collectors.groupingBy(i -> i.getCourseCode(),
                        Collectors.averagingDouble(s -> s.getPercentageComplete())));

        percentages.forEach((k,v) -> System.out.println(k + " " + v));


//        map of statistics
        var percentagesStatistic = students.stream()
                .flatMap(s -> s.getEngagementMap().values().stream())
                .collect(Collectors.groupingBy(i -> i.getCourseCode(),
                        Collectors.summarizingDouble(s -> s.getPercentageComplete())));

        percentagesStatistic.forEach((k,v) -> System.out.println(k + " " + v));

/*
        nested map using the courseCode as the key to the top-level map, with last activity year as the key for the
                nested map
                        */

        var yearMap = students.stream()
                .flatMap(s -> s.getEngagementMap().values().stream())
                .collect(Collectors.groupingBy(i -> i.getCourseCode(),
                        Collectors.groupingBy(i -> i.getLastActivityYear(),
                                Collectors.counting())));
        yearMap.forEach((k,v) -> System.out.println(k + " " + v));

//        counts by enrollment year
        students.stream()
                .flatMap(s -> s.getEngagementMap().values().stream())
                .collect(Collectors.groupingBy(i -> i.getEnrollmentYear(),
                        Collectors.groupingBy(i -> i.getCourseCode(),
                        Collectors.counting())))
                .forEach((k,v) -> System.out.println(k + ": " + v) );










    }
}

