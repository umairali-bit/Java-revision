package dev.lpa;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {


        Course pymc = new Course("PYMC", "Python MasterClass");
        Course jmc = new Course("JMC", "Java MasterClass");
//        Student joe = new Student("US",2019,30,"M",true,
//                pymc, jmc);
//        System.out.println(joe);
//
//        joe.watchLecture("JMC", 10,5,2019);
//        joe.watchLecture("PYMC",7,7,2020);
//
//        System.out.println(joe);

        //using stream.generate with supplier()
//        Stream.generate(() -> Student.getRandomStudent(jmc,pymc))
//                .limit(10)
//                .forEach(i -> System.out.println(i));

        /*
Create a source for a stream of Students.
Use the static method on Student as the Supplier.
Use a large enough number to get a variety of Student data.
Use a combination of the intermediate and terminal operations we've covered so far, to answer the following questions.
How many male and female students are in the group.
How many students fall into the three age ranges, less than age 30, between 30 and 60, over 60 years old.
Use summaryStatistics on the student's age, to get a better idea of how old the student population is.
What countries are the students from?  Print a distinct list of the country codes.
Are there students that are still active and have been enrolled for more than 7 years?  Use one of the match terminal operations to answer this question.
Next, select 5 of the students above and print their information out.
Use summaryStatistics on the student's age, to get a better idea of how old the student population is.
What countries are the students from?  Print a distinct list of the country codes.
Are there students that are still active and have been enrolled for more than 7 years?  Use one of the match terminal operations to answer this question.
Next, select 5 of the students above and print their information out.



         */


//       var students = Stream.generate(() -> Student.getRandomStudent(jmc,pymc))
//                        .limit(1000)
//                        .filter(s -> s.getGender().equals("M"))
//                        .count();
//        System.out.println(students);


        Student[] students = new Student[1000];
        Arrays.setAll(students, i -> Student.getRandomStudent(jmc, pymc));

//        var students = Stream.generate(() -> Student.getRandomStudent(jmc,pymc))
//                .limit(1000);

//        var maleStudents = students.filter(s -> s.getGender().equals("M"));

        var maleStudents = Arrays.stream(students)
                        .filter (s -> s.getGender().equals("M"));
        System.out.println("# of male students " + maleStudents.count());

//        calculating all genders
        for (String gender : List.of("M", "F", "U")) {
            var myStudents = Arrays.stream(students)
                    .filter (s -> s.getGender().equals(gender));
            System.out.println("# of " + gender + " students " + myStudents.count());
        }


//        getting age groups
        List<Predicate<Student>> list = List.of (
                (s) -> s.getAge() < 30,
                (s) -> s.getAge() >= 30 && s.getAge() < 60
        );

        long total = 0;
        for (int i = 0; i < list.size(); i++) {
            var myStudents = Arrays.stream(students).filter(list.get(i));
            long cnt = myStudents.count();
            total += cnt;
            System.out.printf("# of students (%s) = %d%n",
                    i == 0 ? " < 30" : ">= 30 & < 60", cnt);
        }
        System.out.println("# of students >= 60 = " + (students.length - total));

//       getting summaryStatistics
        var ageStream = Arrays.stream(students)
                .mapToInt(i -> i.getAgeEnrolled());
        System.out.println("Stats for Enrollment Age = " + ageStream.summaryStatistics());

        var currentAgeStream = Arrays.stream(students)
                .mapToInt(i -> i.getAge());
        System.out.println("Stats for Current age = " + currentAgeStream.summaryStatistics());

//        getting country codes
        Arrays.stream(students)
                .map(i -> i.getCountryCode())
                .distinct()
                .sorted()
                .forEach(i -> System.out.print(i + " "));

//        getting enrollment age greater than 7 years
        System.out.println();
        boolean longTerm = Arrays.stream(students)
                .anyMatch(s -> (s.getAge() - s.getAgeEnrolled() >= 7) &&
                        (s.getMonthsSinceActive() < 12));
        System.out.println("longTerm Students? " + longTerm);

//        getting longTerm Count
        long longTermCount = Arrays.stream(students)
                .filter(s -> (s.getAge() - s.getAgeEnrolled() >=7) && (s.getMonthsSinceActive() < 12))
                .count();
        System.out.println("longTerm students? " + longTermCount);

//        getting 5 students with no programming experience
       var longTimeLearners = Arrays.stream(students)
                .filter(s -> (s.getAge() - s.getAgeEnrolled() >=7) && (s.getMonthsSinceActive() < 12))
                .filter(s -> !s.hasProgrammingExperience())
                .limit(5)
                .toArray(size -> new Student[size]);// array instantiation
//                .forEach (s -> System.out.println(s));


        var learners = Arrays.stream(students)
                .filter(s -> (s.getAge() - s.getAgeEnrolled() >=7) && (s.getMonthsSinceActive() < 12))
                .filter(s -> !s.hasProgrammingExperience())
                .limit(5)
                .collect(Collectors.toList()); //give a modifiable list

        Collections.shuffle(learners);



    }
}
