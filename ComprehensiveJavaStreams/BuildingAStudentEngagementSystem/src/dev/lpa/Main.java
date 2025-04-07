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
        Stream.generate(() -> Student.getRandomStudent(jmc,pymc))
                .limit(10)
                .forEach(i -> System.out.println(i));

    }
}
