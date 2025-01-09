package dev.lpa;

import java.util.*;

public class main {

    public static void main(String[] args) {

        //List<String> list = new ArrayList<>();
        //Collection<String> list = new ArrayList<>();
        //Collection<String> list = new HashSet<>(); but there would be no order in the list and collection interface doesnt have sort()
        Collection<String> list = new TreeSet<>();

        String[] names = {"Harry", "Lord", "Ron", "Hermione", "Luna"};
        list.addAll(Arrays.asList(names));
        System.out.println(list);

        list.add("Darco");
        list.addAll(Arrays.asList("Jack", "Frank", "Bubba"));
        System.out.println(list);

        System.out.println("Is Frank is in the list? " + list.contains("Frank"));

        list.removeIf(s-> s.charAt(0) == 'F');
        System.out.println(list);
        System.out.println("Is Frank is in the list? " + list.contains("Frank"));



    }
}
