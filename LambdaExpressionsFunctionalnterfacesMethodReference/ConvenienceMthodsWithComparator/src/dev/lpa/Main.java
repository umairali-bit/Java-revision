package dev.lpa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        record Person(String firstName, String lastName) {}

        List<Person> list = new ArrayList<>(Arrays.asList(

                new Person ("Harry", "Potter"),
                new Person ("Hermione", "Granger"),
                new Person ("Lord", "Voldemort"),
                new Person ("Ron", "Weasley")
        ));

        //sorting names by last names
        list.sort((o1,o2) -> o1.lastName.compareTo(o2.lastName));
        list.forEach(System.out::println);//characters are printed out in the last name order


        System.out.println("-".repeat(30));

        //same thing but very concise code like above by using static convenience methods
        list.sort(Comparator.comparing(Person::lastName));
        list.forEach(System.out::println);

        System.out.println("-".repeat(30));

        //same thing but chaining the first name comparison. lastNames will be sorted out first and then firstnames
        list.sort(Comparator.comparing(Person::lastName)
                        .thenComparing(Person::firstName));
        list.forEach(System.out::println);

        System.out.println("-".repeat(30));

        //same thing but reversing the order

        list.sort(Comparator.comparing(Person::lastName)
                .thenComparing(Person::firstName).reversed());
        list.forEach(System.out::println);




    }
}
