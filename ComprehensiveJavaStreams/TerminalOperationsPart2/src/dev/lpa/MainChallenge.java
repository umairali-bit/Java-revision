package dev.lpa;

import java.util.List;
import java.util.stream.Stream;

public class MainChallenge {

    /*
    Copy the two courses, jmc and pymc, from the MainCollect's main method, passing both an additional argument
    for the lecture count. 50 for pymc, and 100 for jmc.


*/
    public static void main(String[] args) {

        Course pymc = new Course("PYMC", "Python MasterClass", 50);
        Course jmc = new Course("JMC", "Java MasterClass", 100);
        Course gamesJava = new Course ("GAJA", "Creating Games in Java");


        List<Student> students = Stream.generate(() -> Student.getRandomStudent(pymc,jmc,gamesJava))
                .limit(5000)
                .toList();








    }

}
