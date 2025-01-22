package dev.lpa;

import java.util.HashSet;
import java.util.Set;

public class Contact {

    String name;
    Set<String> emails = new HashSet<>();
    Set<String> phones = new HashSet<>();

    public Contact(String name) {
        this(name,null);
    }

    public Contact(String name, String email) {
        this(name, email, 0);
    }

    public Contact (String name, long phone) {
        this(name, null, phone);
    }

    public Contact (String name, String email, long phone) {
        this.name = name;
        if(email != null) {
            emails.add(email);
        }
        if (phone > 0) {
            String p = String.valueOf(phone);
            p = "(%S) %s=%s".formatted(p.substring(0,3),p.substring(3,6),p.substring(6));
            phones.add(p);
        }

    }

    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return "%s: %s %s".formatted(name, emails, phones);
    }



    //public method that returns a contact

    public Contact mergeContactData(Contact contact) {

        Contact newContact = new Contact(name);
        newContact.emails = new HashSet<>(this.emails);
        newContact.phones = new HashSet<>(this.phones);
        newContact.emails.addAll(contact.emails);
        newContact.phones.addAll(contact.phones);
        return newContact;

    }


}




















