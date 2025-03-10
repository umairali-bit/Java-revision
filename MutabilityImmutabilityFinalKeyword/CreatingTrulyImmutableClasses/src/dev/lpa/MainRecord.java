package dev.lpa;

public class MainRecord {

    public static void main(String[] args) {


        PersonRecord jane = new PersonRecord("Jane", "01/01/1930");
        PersonRecord jim = new PersonRecord("Jim", "02/02/1940");
        PersonRecord joe = new PersonRecord("Joe", "03/03/1934");

        // to set up john kids
        PersonRecord[] johnsKids = {jane, jim, joe};
        PersonRecord john = new PersonRecord("John", "o4/04/1910", johnsKids);
        System.out.println(john);


        PersonRecord johnCopy = new PersonRecord("John", "o4/04/1910");
        System.out.println(johnCopy);

        PersonRecord[] kids = johnCopy.kids();
        kids[0] = jim;
        kids[1] = new PersonRecord("Ann", "04/04/1936");
        System.out.println(johnCopy);// John, dob = o4/04/1910, kids = Jim , Ann ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,

        johnsKids[0] = new PersonRecord("Ann", "04/04/1936");
        System.out.println(john);


    }
}
