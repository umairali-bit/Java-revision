package dev.lpa;

/*
person class with fields using encapsulation techniques
 */

import java.util.Arrays;

public class PersonImmutable {

    private final String name;
    private final String dob;
    protected final PersonImmutable[] kids;//kids should be able to to be accessed directly from subclass


    public PersonImmutable(String name, String dob, PersonImmutable[] kids) {
        this.name = name;
        this.dob = dob;
        this.kids = kids == null ? null : Arrays.copyOf(kids, kids.length);
    }

    public PersonImmutable(String name, String dob) {
        this(name, dob, null);
    }

    //With the following code a subclass can easily construct a new person, uusing another person object to do it
    //basically making a copy of the method argument

    protected PersonImmutable (PersonImmutable person) {
        this.name = person.name;
        this.dob = person.dob;
        this.kids = person.kids;

    }

    public String getName() {
        return name;
    }

    public String getDob() {
        return dob;
    }

    public PersonImmutable[] getKids() {
        return kids == null ? null : Arrays.copyOf(kids, kids.length);
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
        return name + ", dob = " + getDob() + ", kids = " + kidString;
    }


}
