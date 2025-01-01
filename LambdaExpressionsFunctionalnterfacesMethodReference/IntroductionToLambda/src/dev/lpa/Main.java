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
                new Main.Person ("Sally", "Brown"), //we can use records as static
                new Person ("Peppermint", "Patty"),
                new Person ("Linus", "Van Pelt"),
                new Person ("Charlie" ,"Brown"),
                new Person ("Lucy", "Van Pelt")
        ));


        //implementing a comparator method using anonymous class

        var comparatorLastName = new Comparator<Person>() {

            @Override
            public int compare(Person o1, Person o2) {
                return o1.lastName().compareTo(o2.lastName());
            }
        };

        //executing sorting list
        //applying Lambda
        people.sort((o1, o2) -> o1.lastName().compareTo(o2.lastName()));
        System.out.println(people); //same last name is going to be according to insertion order

        //creating an interface that extends comparator
        interface EnhancedComparator <T> extends Comparator<T> {

            //abstract method
            int secondLevel (T o1, T o2);
        }

        //creating an anonymous class

        var comparatorMixed = new EnhancedComparator<Person>() {

            @Override
            public int compare(Person o1, Person o2) {
                int result = o1.lastName().compareTo(o2.lastName());
                return (result == 0 ? secondLevel(o1,o2) : result);
            }

            @Override
            public int secondLevel(Person o1, Person o2) {
                return o1.firstName().compareTo(o2.firstName());
            }
        };

        people.sort(comparatorMixed);
        System.out.println(people);




    }
}
