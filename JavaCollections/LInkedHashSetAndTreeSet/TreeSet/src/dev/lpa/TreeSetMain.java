package dev.lpa;

import java.util.*;

public class TreeSetMain {

    public static void main(String[] args) {

        List<Contact> phones = ContactData.getData("phone");
        List<Contact> emails = ContactData.getData("emails");


        Comparator<Contact> mySort = Comparator.comparing(Contact::getName);
        //need to pass comparator
        NavigableSet<Contact> sorted = new TreeSet<>(mySort);
        sorted.addAll(phones);
        sorted.forEach(System.out::println);

        //trees have natural sort order
        NavigableSet<String> justNames = new TreeSet<>();
        phones.forEach(c -> justNames.add(c.getName()));
        System.out.println(justNames);

        


    }
}
