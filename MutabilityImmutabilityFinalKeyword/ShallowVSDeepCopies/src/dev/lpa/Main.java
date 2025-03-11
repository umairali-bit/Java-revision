package dev.lpa;


import java.util.Arrays;

record Person (String name, String dob, Person[] kids) {

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", kids=" + Arrays.toString(kids) +
                '}';
    }
}

public class Main {


    public static void main(String[] args) {

        //creating 5 persons

        Person joe = new Person("Joe", "01/01/1961", null);
        Person jim = new Person("Jim", "02/02/1962", null);
        Person jack = new Person("Jack", "03/03/1963", null);
        Person jane = new Person("Jane", "04/04/1964", null);
        Person jill = new Person("Jill", "05/05/1965", null);

        //creating an array of person
        Person[] persons = {joe, jim, jack, jane, jill};
        //creating a shallow copy
        Person[] personsCopy = Arrays.copyOf(persons,persons.length);

        //to confirm that the two arrays are referencing the same record
        for (int i = 0; i <5; i++) {
            if (persons[i] == personsCopy[i]){
                System.out.println("Equal References " + persons[i]);
            }
        }


    }
}
