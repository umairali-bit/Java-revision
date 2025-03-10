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

        //adding a person to john
        john.setKids(new Person[]{new Person("Ann", "04/04/1930")});
        System.out.println(john);//John, dob = o4/04/1910, kids = Ann -> completely changed

        Person[] kids = john.getKids();
        kids[0] = jim;
        System.out.println(john); //John, dob = o4/04/1910, kids = Jim -> we dont want that

        //assigning the variable kids to null
        kids = null;
        System.out.println(john);//John, dob = o4/04/1910, kids = Jim

        john.setKids(kids);
        System.out.println(john);// John, dob = o4/04/1910, kids = n/a


















    }


}
