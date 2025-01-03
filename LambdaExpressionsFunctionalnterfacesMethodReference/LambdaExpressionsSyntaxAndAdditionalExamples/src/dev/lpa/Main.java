package dev.lpa;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>(List.of(
                "alpha","bravo","charlie","delta"
        ));

        for (String s : list) {
            System.out.println(s);
        }

        //alternatively to for loop
        System.out.println("---------");
        //using lambda expressions
        list.forEach((var myString) -> System.out.println(myString));

        //to use multiple statements
        System.out.println("---------");
        String prefix = "nato"; //its final. you cannot change it
        list.forEach((var myString) -> {
            char first = myString.charAt(0);
            System.out.println(prefix + " " + myString + " means " + first);
        });
    }
}
