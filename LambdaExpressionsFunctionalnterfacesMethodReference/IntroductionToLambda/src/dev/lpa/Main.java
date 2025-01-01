package dev.lpa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    record Person (String firstName, String lastName) {

        @Override
        public String toString() {
            return firstName + " " + lastName;
        }
    }



    public static void main(String[] args) {


        //creating a list of 'Person' records
        List<Person> people = new ArrayList<>(Arrays.asList(
                new Main.Person ("Harry", "Potter"), //we can use records as static
                new Person ("Hermoine" ,"Granger"),
                new Person ("Darco", "Malfoy"),
                new Person ("Lord", "Voldermort"),
                new Person ("Ron", "Weasley")));

        //implementing a comparator method using anonymous class

        var comparatorLastName = new Comparator<Person>() {

            @Override
            public int compare(Person o1, Person o2) {
                return o1.lastName().compareTo(o2.lastName());
            }
        };

        //executing sorting list
        people.sort((o1, o2) -> o1.lastName().compareTo(o2.lastName()));
        System.out.println(people);




    }
}
