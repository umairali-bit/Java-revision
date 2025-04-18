package dev.lpa;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class MainTerminalOptional {

    public static void main(String[] args) {


        Course pymc = new Course("PYMC", "Python MasterClass");
        Course jmc = new Course("JMC", "Java Masterclass");

        List<Student> students =
                Stream.generate(() -> Student.getRandomStudent(jmc,pymc))
                        .limit(1000)
                        .toList();


        int minAge = 18;


        //     use of findAny
        students.stream()
                .filter(i -> i.getAge() <= minAge)
                .findAny()
                .ifPresentOrElse(s -> System.out.printf("Student %d from %s is %d%n",
                       s.getStudentId(),s.getCountryCode(),s.getAge()),
                        () -> System.out.println("Did not find anyone under " + minAge));

//      findFirst()
        students.stream()
                .filter(i -> i.getAge() <= minAge)
                .findFirst()
                .ifPresentOrElse(s -> System.out.printf("Student %d from %s is %d%n",
                                s.getStudentId(),s.getCountryCode(),s.getAge()),
                        () -> System.out.println("Did not find anyone under " + minAge));

//      using Comparator, min()
        students.stream()
                .filter(i -> i.getAge() <= minAge)
                .min(Comparator.comparing(i -> i.getAge()))
//                .findFirst()
                .ifPresentOrElse(s -> System.out.printf("Student %d from %s is %d%n",
                                s.getStudentId(),s.getCountryCode(),s.getAge()),
                        () -> System.out.println("Did not find anyone under " + minAge));



//       max()
        students.stream()
                .filter(i -> i.getAge() <= minAge)
                .max(Comparator.comparing(i -> i.getAge()))
//              .findFirst()
                .ifPresentOrElse(s -> System.out.printf("Student %d from %s is %d%n",
                                s.getStudentId(),s.getCountryCode(),s.getAge()),
                        () -> System.out.println("Did not find anyone under " + minAge));


//   mapToInt(), average()
        students.stream()
                .filter(i -> i.getAge() <= minAge)
                .mapToInt(i -> i.getAge())
                .average()
                .ifPresentOrElse(a -> System.out.printf("Avg age under 21 : %.2f%n",a)
                ,() -> System.out.println("Did not find anyone under " + minAge));




//        map(), reduce(), distinct()
        students.stream()
                .filter(i -> i.getAge() <= minAge)
                .map(i -> i.getCountryCode())
                .distinct()
                .reduce((a,b) -> String.join(",", a,b))
                .ifPresentOrElse(s -> System.out.println(s), () -> System.out.println("None found"));


//        //        getting list of countries with streams
//        List<String> countries = students.stream()
//                .map(i -> i.getCountryCode())
//                .distinct()
//                .toList();
//
//        Optional.of(countries)
//                .map(l -> String.join(",",l))
//                .filter(l -> l.contains("FR"))
//                .ifPresentOrElse(System.out::println, () -> System.out.println("Missing FR"));


//        changing the above code into a single statement
                students.stream()
                .map(i -> i.getCountryCode())
                .distinct()
                .map(l -> String.join(",",l))
                .filter(l -> l.contains("AU"))
                        .findAny() //terminal operation needs to added before ifPresentOrElse
                .ifPresentOrElse(System.out::println, () -> System.out.println("Missing AU"));


    }
}
