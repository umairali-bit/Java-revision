package dev.lpa;

import java.util.stream.Stream;

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

         */

        var students = Stream.generate(() -> Student.getRandomStudent(jmc,pymc))
                .limit(1000);

       var maleStudents = students.filter(s -> s.getGender().equals("M"));

        System.out.println("# of male students " + maleStudents.count());

    }
}
