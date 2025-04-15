package dev.lpa;

import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainOptional {


    public static void main(String[] args) {

        Course pymc = new Course("PYMC", "Python MasterClass");
        Course jmc = new Course("JMC", "Java MasterClass");

        List<Student> students = Stream.generate(() -> Student.getRandomStudent(pymc,jmc))
                .limit(1000)
//              .toList();
                .collect(Collectors.toList()); //because we want to modify the list


        Optional<Student> o1 = getStudent(null, "first");
        System.out.println("Empty = " + o1.isEmpty() + ", Present = " + o1.isPresent());
        System.out.println(o1);

    }

// private static method that returns Optional with a type argument of Student. It will take a List of Students,
// as well as String for the type of retrieval, which can be first last or any.
    private static Optional<Student> getStudent(List<Student> list, String type) {

        if (list == null || list.size() == 0) {
 //           return null;
            return Optional.empty();
        } else if (type.equals("first")) {
            return Optional.of(list.get(0));
        } else if (type.equals("last")) {
            return Optional.of(list.get(list.size() - 1));
        }

        return Optional.of(list.get(new Random().nextInt(list.size())));

    }


}
