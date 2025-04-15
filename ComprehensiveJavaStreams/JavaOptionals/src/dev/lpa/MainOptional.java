package dev.lpa;

import java.util.ArrayList;
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

        Optional<Student> o2 = getStudent(new ArrayList<>(), "first");
        System.out.println("Empty = " + o2.isEmpty() + ", Present = " + o2.isPresent());
        System.out.println(o2);
//        System.out.println(o2.get());
        o2.ifPresent(System.out::println); //no output because Optional is empty
        o2.ifPresentOrElse(i -> System.out.println(i), () -> System.out.println("-----> Empty"));

//        students.add(0, null);
        Optional<Student> o3 = getStudent(students, "first");
        System.out.println("Empty = " + o3.isEmpty() + ", Present = " + o2.isPresent());
        System.out.println(o3);
        o3.ifPresent(System.out::println);


    }

// private static method that returns Optional with a type argument of Student. It will take a List of Students,
// as well as String for the type of retrieval, which can be first last or any.
    private static Optional<Student> getStudent(List<Student> list, String type) {

        if (list == null || list.size() == 0) {
 //           return null;
            return Optional.empty();
        } else if (type.equals("first")) {
            return Optional.ofNullable(list.get(0));
        } else if (type.equals("last")) {
            return Optional.ofNullable(list.get(list.size() - 1));
        }

        return Optional.ofNullable(list.get(new Random().nextInt(list.size())));

    }


}
