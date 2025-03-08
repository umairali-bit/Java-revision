package dev.lpa;

/*
creating a genealogy program, tracking people, names, birthdates and kids.
 */

public class Main {

    public static void main(String[] args) {

//        Person jane = new Person();
//        jane.setName("Jane");
//        Person jim = new Person();
//        jim.setName("Jim");
//        Person joe = new Person();
//        joe.setName("Joe");
//        Person john = new Person();
//        john.setName("John");
//        john.setDob("05/05/1900");
//        john.setKids(new Person[]{jane, jim, joe});
//        System.out.println(john);
//
//        //john is not immutable
//        john.setName("Jacob");
//        john.setKids(new Person[]{new Person(), new Person()});
//        System.out.println(john);


        Person jane = new Person("Jane", "01/01/1930");
        Person jim = new Person("Jim", "02/02/1940");
        Person joe = new Person("Joe", "03/03/1934");

        // to set up john kids
        Person[] johnsKids = {jane, jim, joe};
        Person john = new Person("John", "o4/04/1910", johnsKids);
        System.out.println(john);



    }


}
