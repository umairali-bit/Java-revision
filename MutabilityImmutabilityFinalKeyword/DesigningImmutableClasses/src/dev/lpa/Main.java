package dev.lpa;

/*
creating a genealogy program, tracking people, names, birthdates and kids.
 */

public class Main {

    public static void main(String[] args) {

        Person jane = new Person();
        jane.setName("Jane");
        Person jim = new Person();
        jim.setName("Jim");
        Person joe = new Person();
        joe.setName("Joe");
        Person john = new Person();
        john.setName("John");
        john.setDob("05/05/1900");
        john.setKids(new Person[]{jane, jim, joe});
        System.out.println(john);

    }


}
