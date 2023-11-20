package dev.lpa;



public class Main {




    public static void main(String[] args) {



        MobilePhone mp = new MobilePhone("609-254-1234");
        mp.addNewContact(new Contact("Hermione", "223124567"));
        mp.addNewContact(new Contact("Harry", "655678765"));
        mp.addNewContact(new Contact("Harry", "655678765"));
        mp.addNewContact(new Contact("Ron", "9087652123"));
        mp.addNewContact(new Contact("Luna", "665228304"));
        mp.addNewContact(new Contact("Amanda","88778855231"));





        mp.printContacts();
        //mp.removeContact(new Contact("Amanda","88778855231"));
        mp.updateContact(new Contact("Amanda","88778855231"), new Contact("Armina", "55443322"));











    }














}
