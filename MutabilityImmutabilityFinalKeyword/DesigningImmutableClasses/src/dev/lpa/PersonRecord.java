package dev.lpa;

import java.util.Arrays;

public record PersonRecord(String name, String dob, PersonRecord[] kids) {

    public PersonRecord(String name, String dob) {
        this(name, dob, new PersonRecord[20]);
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

    @Override
    public PersonRecord[] kids() {
        return kids == null ? null : Arrays.copyOf(kids, kids.length);
    }
}
