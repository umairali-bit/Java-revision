package dev.lpa;

/*
Create an array of names, in mixed cases
Create a list of FUnction interfaces, or alternately Unary Operator, which will contain all the operations you want executed
on each name in your array.

Make each name upper case
Add a random middle initial
Add a last name, which should be the reverse of the first


 */

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {

    private static Random random = new Random();

    public static void main(String[] args) {

        String[] firstNames = {"Bob", "Anna", "Harry", "Hermione","Ron" };

        //Make each name upper case
        Arrays.setAll(firstNames, i -> firstNames[i].toUpperCase());
        System.out.println(Arrays.toString(firstNames));

        //Add a random middle initial
        List <String> backedByArray = Arrays.asList(firstNames);
        backedByArray.replaceAll( s -> s += " " + getRandom('A', 'D'));
        System.out.println(Arrays.toString(firstNames));

        //Add a last name, which should be the reverse of the first
        backedByArray.replaceAll(s-> s += " " + getReversedName(s.split(" ")[0]));
        Arrays.asList(firstNames).forEach(System.out::println);


    }

    //adding a random initial
    public static char getRandom (char startChar, char endChar) {
        return (char) random.nextInt((int) startChar, (int) endChar + 1);
    }

    public static String getReversedName (String firstNames) {
        return new StringBuilder(firstNames).reverse().toString();
    }
}
