package dev.lpa;

/*
person class with fields using encapsulation techniques
 */

import java.util.Arrays;

public class Person {

    private String name;
    private String dob;
    private Person[] kids;


    public Person(String name, String dob, Person[] kids) {
        this.name = name;
        this.dob = dob;
        this.kids = kids;
    }

    public String getName() {
        return name;
    }

    public String getDob() {
        return dob;
    }

    public Person[] getKids() {
        return kids;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setKids(Person[] kids) {
        this.kids = kids;
    }

    @Override
    public String toString() {

        String kidString = "n/a";

        if (kids != null) {
            String[] names = new String[kids.length];
            /*
            using setAll on Arrays class to populate names array. The parameter for the Lambda is an integer,
            an index. using that integer (i) getting that child from kids array. That could be null, so use of
            a ternary operator to check for that, and set the name to an empty string, otherwise set it to the kid's
            name. Then the join method on String has been used joining all the kids names by comma
             */
            Arrays.setAll(names, i -> names[i] = kids[i] == null ? "" : kids[i].name);
            kidString = String.join(" , ", names);

        }
        return name + ", dob = " + dob + ", kids = " + kidString;
    }


}
