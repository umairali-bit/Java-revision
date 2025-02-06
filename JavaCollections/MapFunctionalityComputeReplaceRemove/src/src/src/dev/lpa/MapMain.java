package src.src.dev.lpa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapMain {


    public static void main(String[] args) {

        List<Contact> phones = ContactData.getData("phone");
        List<Contact> emails = ContactData.getData("email");


        List<Contact> fullList = new ArrayList<>(phones);
        fullList.addAll(emails);

        fullList.forEach(System.out::println);
        System.out.println("-".repeat(50));


        Map<String, Contact> contacts = new HashMap<>();

        for (Contact contact : fullList) {
            contacts.put(contact.getName(), contact);

        }
         contacts.forEach((k, v) -> System.out.println("key = " + k + ", value = " + v));

        System.out.println("-".repeat(50));

        System.out.println(contacts.get("Charlie Brown"));

        System.out.println(contacts.get("chuck brown"));


        Contact defaultContact = new Contact("Chuck Brown");
        System.out.println(contacts.getOrDefault("Chuck Brown", defaultContact));

        System.out.println("-".repeat(50));
        contacts.clear();

        for (Contact contact : fullList) {
            Contact duplicate = contacts.put(contact.getName(), contact);

            if (duplicate != null) {
//                System.out.println("duplicate = " + duplicate);
//                System.out.println("current = " + contact);
                contacts.put(contact.getName(), contact.mergeContactData(duplicate));



            }


        }

        contacts.forEach((k, v) -> System.out.println("key = " + k + ", value = " + v));
        System.out.println("-".repeat(50));
        contacts.clear();



        for (Contact contact : fullList) {
            contacts.putIfAbsent(contact.getName(), contact);

        }
        contacts.forEach((k, v) -> System.out.println("key = " + k + ", value = " + v));


        System.out.println("-".repeat(50));
        contacts.clear();



        for (Contact contact : fullList) {
            Contact duplicate = contacts.putIfAbsent(contact.getName(), contact);

            if (duplicate != null) {
                contacts.put(contact.getName(), contact.mergeContactData(duplicate));
            }

        }
        contacts.forEach((k, v) -> System.out.println("key = " + k + ", value = " + v));

        //The merge method, it still takes a key and value but third parameter us a BiFunction interface
        System.out.println("-".repeat(50));
        contacts.clear();
        fullList.forEach(contact -> contacts.merge(contact.getName(), contact,
                Contact::mergeContactData //lets you merge a bunch of contacts from an ArrayList into a hashmap with a single statement.

                // OR

        //        (previous, current) ->  previous.mergeContactData(current)

                //OR
        // {
                    //System.out.println("prev: " + previous + " : current " + current);
                    //Contact merged = previous.mergeContactData(current);
                    //System.out.println("merged: " + merged);

                    //return merged;
    //}

                ));
        contacts.forEach((k, v) -> System.out.println("key = " + k + ", value = " + v));

        System.out.println("-".repeat(50));

        for (String contactName : new String[] {"Daisy Duck", "Daffy Duck", "Scrooge McDuck"}) {
            //contacts.compute(contactName, (k,v) -> new Contact(k));
            contacts.computeIfAbsent(contactName, (k) -> new Contact(k));
        }

        contacts.forEach((k,v) -> System.out.println("key=" + k + " , value= " + v));


        //if all the duck people work at a family business
        System.out.println("-".repeat(50));

        for (String contactName : new String[] {"Daisy Duck", "Daffy Duck", "Scrooge McDuck"}) {
            //contacts.compute(contactName, (k,v) -> new Contact(k));
            contacts.computeIfPresent(contactName, (k,v) -> {
                v.addEmail("Fun Place"); return v;
            });
        }

        contacts.forEach((k,v) -> System.out.println("key=" + k + " , value= " + v));


        //replaceAll() takes a BiFunction that has two arguments. It takes the key and value, and the function should
        //return an object the same type as the value.

        System.out.println("-".repeat(50));
        contacts.replaceAll((k,v) -> {
            String newEmail = k.replaceAll(" ", "") + "@funplace.com";
            v.replaceEmailIfExists("DDuck@funplace.com", newEmail);
            return v;
        });
        contacts.forEach((k,v) -> System.out.println("key=" + k + " , value= " + v));



        //replacing just one element in the map, by either matching on key alone, or both key and value
        System.out.println("-".repeat(50));

        Contact daisy = new Contact("Daisy Duck", "daisyj@duck.com");

        Contact replacedContact = contacts.replace("Daisy Duck", daisy);
        System.out.println("daisy = " + daisy);
        System.out.println("replacedContact = " + replacedContact);
        contacts.forEach((k,v) -> System.out.println("key=" + k + ", value= " + v));

















    }
}
