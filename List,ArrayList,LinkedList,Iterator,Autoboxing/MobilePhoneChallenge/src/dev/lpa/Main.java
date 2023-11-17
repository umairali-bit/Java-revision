package dev.lpa;
import dev.lpa.MobilePhone;


public class Main {

    private static Contact contact;


    public static void main(String[] args) {



        MobilePhone mp = new MobilePhone("609-256-9967");
        mp.addNewContact(new Contact("Bob","31415926"));
        mp.addNewContact(Contact.createContact("Tom", "11235813"));
        mp.addNewContact((new Contact("Jane","23571113")));
        mp.addNewContact(new Contact("Alice","16180339"));

        mp.printContacts();

        mp.removeContact(contact.getName("Alice"),contact.getPhoneNumber("16180339"));




    }














}
