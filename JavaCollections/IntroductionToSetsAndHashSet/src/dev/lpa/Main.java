package dev.lpa;


import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        List<Contact> emails = ContactData.getData("email");
        List<Contact> phones = ContactData.getData("phone");
        printData("Phone list", phones);
        printData("Email List", emails);

        //got a list of names with phone numbers with mobile phone contacts and another list with email contacts
        //combine these contacts, merging any duplicates into a single contact, with multiple emails and phone numbers on a single record

        //creating two hashsets
        Set<Contact> emailContacts = new HashSet<>(emails);
        Set<Contact> phoneContacts = new HashSet<>(phones);

        printData("Phone Contacts",phoneContacts);
        printData("Email Contacts",emailContacts);

        int index = emails.indexOf(new Contact("Robin Hood"));
        Contact robinHood = emails.get(index);
        robinHood.addEmail("Sherwood Forest");
        robinHood.addEmail("Sherwood Forest");
        robinHood.replaceEmailIfExists("RHood@sherwoodforest.com", "RHood@sherwoodforest.org");
        System.out.println(robinHood);

        // to perform a union we can use BulkAll()
        //it will return elements of both of the sets
        Set<Contact> unionAB = new HashSet<>();
        unionAB.addAll(emailContacts);
        unionAB.addAll(phoneContacts);
        printData("(A \u222A B) Union of emails (A) with phones (B)", unionAB);

        //intersection of two or more sets will return only the elements the sets have common.
        Set<Contact> intersectAB = new HashSet<>(emailContacts);
        intersectAB.retainAll(phoneContacts);
        printData("(A \u2229 B) intersects emails (A) with phones (B)", intersectAB);



    }

    public static void printData (String header, Collection<Contact> contacts) {
        System.out.println("-".repeat(40));
        System.out.println(header);
        System.out.println("-".repeat(40));
        contacts.forEach(System.out::println);
    }
}
