package dev.lpa;

import java.util.HashSet;
import java.util.Objects;
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
            p = "(%S) %s-%s".formatted(p.substring(0,3),p.substring(3,6),p.substring(6));
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Contact contact = (Contact) o;

        return getName().equals(contact.getName());
    }

    @Override
    public int hashCode() {
        return 33 * getName().hashCode();
    }

    //using equals and hashCode() disappeared a few numbers and emails. To overcome this problem, create two methods
    //addEmail() will generate and add a company email to the current instance's email set

    public void addEmail (String companyName) {

        String[] names = name.split(" "); //splitting names
        String email = "%c%s@%s.com".formatted(name.charAt(0),names[names.length-1], //email would be first character of name and last name
                companyName.replaceAll(" ", "").toLowerCase());// followed by the company's name, all lower case and adding .com to it

        //emails.add(email); //add() to email set, passing new String

        if (!emails.add(email)) {
            System.out.println(name + "already has email  " + email);
        } else {
            System.out.println(name + "now has email ");
        }

    }

    public void replaceEmailIfExists (String oldEmail, String newEmail) {

        if (emails.contains(oldEmail)) {
            emails.remove(oldEmail);
            emails.add(newEmail);

        }

    }
}




















