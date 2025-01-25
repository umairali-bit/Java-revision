package dev.lpa;

import java.util.*;

public class TreeSetMain {

    public static void main(String[] args) {

        List<Contact> phones = ContactData.getData("phone");
        List<Contact> emails = ContactData.getData("email");


        Comparator<Contact> mySort = Comparator.comparing(Contact::getName);
        //need to pass comparator
        NavigableSet<Contact> sorted = new TreeSet<>(mySort);
        sorted.addAll(phones);
        sorted.forEach(System.out::println);

        //trees have natural sort order
        NavigableSet<String> justNames = new TreeSet<>();
        phones.forEach(c -> justNames.add(c.getName()));
        System.out.println(justNames);


        //The fullSet set has the sorted mechanism of TreeSet passed to the constructor
        NavigableSet<Contact> fullSet = new TreeSet<>(sorted);
        fullSet.addAll(emails);
        fullSet.forEach(System.out::println);

        //There is a method on the SortedSet Interface that returns a comparator "sorted" used in the set
        List<Contact> fullList = new ArrayList<>(phones);
        fullList.addAll(emails);
        fullList.sort(sorted.comparator());
        System.out.println("-".repeat(10));
//        for (Contact contact : fullList) {
//            System.out.println(contact);
//        }
        fullList.forEach(System.out::println);


            //min and max on trees
//        Contact min = Collections.min(fullSet);
//        Contact max = Collections.max(fullSet);

        // The above two methods wont compile because of comparator is not used in Trees
        Contact min = Collections.min(fullSet, fullSet.comparator());
        Contact max = Collections.max(fullSet, fullSet.comparator());

        //SortedInterface also includes first and last methods
        Contact first = fullSet.first();
        Contact last = fullSet.last();

        System.out.println("-".repeat(9));

        System.out.printf("min = %s, first = %s %n", min.getName(), first.getName());
        System.out.printf("max = %s, last = %s %n", max.getName(), last.getName());

        System.out.println("-".repeat(9));







    }
}
