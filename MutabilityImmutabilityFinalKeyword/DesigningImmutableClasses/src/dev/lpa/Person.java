package dev.lpa;

/*
person class with fields using encapsulation techniques
 */

public class Person {

    private String name;
    private String dob;
    private Person[] kids;

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
}
