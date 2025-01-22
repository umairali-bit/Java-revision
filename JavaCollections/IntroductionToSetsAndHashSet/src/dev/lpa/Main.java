package dev.lpa;

/*
Create a Contact Class that has fields, name, a String, emails, a HashSet of String, and phones, another HashSet of String
4 - constructors. The first just takes a name. The second should have a name, and a single email of type String, The thrid constructor
should also have two arguments name, and the second parameter being a long, which represents a 10-digit phone number.
 */

import java.util.Collection;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Contact> emails = ContactData.getData("email");
        List<Contact> phones = ContactData.getData("phone");
        printData("Phone list", phones);
        printData("Email List", emails);




    }

    public static void printData (String header, Collection<Contact> contacts) {
        System.out.println("-".repeat(40));
        System.out.println(header);
        System.out.println("-".repeat(40));
        contacts.forEach(System.out::println);
    }
}
