package dev.lpa;

import java.util.*;

public class Main {

    public static void main(String[] args) {


        String aText = "Hello";
        String bText = "Hello";
        String cText = String.join("l","He","lo");
        String dText = "He".concat("llo");
        String eText = "hello";


        List<String> hellos = Arrays.asList(
                aText,bText,cText,dText,eText
        );

        hellos.forEach(s -> System.out.println(s + ": " + s.hashCode()));

        /*
        Hello: 69609650
        Hello: 69609650
        Hello: 69609650
        Hello: 69609650
        hello: 99162322
         */


        //hashSet
        //hashSet is a class that implements the Set interface and track duplicates by their hascode
        Set<String> mySet = new HashSet<>(hellos);
        System.out.println("mySet = " + mySet);
        System.out.println("# of elements = " + mySet.size());

        /*
        mySet = [Hello, hello]
        # of elements = 2
         */

        for (String setValue : mySet) {
            System.out.print(setValue + ":");
            for (int i = 0; i < hellos.size(); i ++) {
                if (setValue == hellos.get(i)) {
                    System.out.print(i + ",");
                }
            }
            System.out.println(" ");
        }
    }
}
