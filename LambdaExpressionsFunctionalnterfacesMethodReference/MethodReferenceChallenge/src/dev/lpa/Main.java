package dev.lpa;

/*
Create an array of names, in mixed cases
Create a list of FUnction interfaces, or alternately Unary Operator, which will contain all the operations you want executed
on each name in your array.

Make each name upper case
Add a random middle initial
Add a last name, which should be the reverse of the first

Use a mix on Lmabda expressions and method references.

Create a method that takes the name array, and the function list, and applied each function to each name, using the
transform method on String

All changes should be applied to the original array

 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.UnaryOperator;

public class Main {

    private static Random random = new Random();

    private record Person (String first) {

        public String last(String s){
            return first + " " + s.substring(0, s.indexOf(" "));

        }
    }

    public static void main(String[] args) {

        String[] names = {"Bob", "Anna", "Harry","Hermione","Ron"};

        //setting up a Person (record) in main()
        Person tim = new Person("Tim");

        //list of functions
        List <UnaryOperator<String>> list = new ArrayList<>(List.of(

                //all upperCase
                String::toUpperCase,
                //adding random middle initial
                s -> s += " " + getRandomChar('D', 'M') + ".",
                s-> s+= " " + reverse(s, 0,s.indexOf(" ")),
                //reverse the entire string
                Main::reverse,
                
                //creating a new String
                //s -> new String("Howdy " + s),
                String::new,
                //instead of new we can use valueOf
                String::valueOf,

                tim::last,//bounded receiver
                tim::last,
                (new Person("Marry"))::last


        ));

        applyChanges(names,list);

    }

    //Create a method that takes the name array, and the function list, and applied each function to each name, using the
    //transform method on String
    public static void applyChanges (String [] names, List<UnaryOperator<String>> stringFunctions) {

        List <String> backedByArray = Arrays.asList(names);
        for (var function : stringFunctions) {
            backedByArray.replaceAll(s -> s.transform(function));
            System.out.println(Arrays.toString(names));
        }
    }

    public static char getRandomChar (char startChar, char endChar) {
        return (char) random.nextInt((int) (startChar), (int) (endChar + 1));
    }

    //reverse the whole string
    private static String  reverse (String s ) {
        return reverse (s, 0,s.length());
    }
    //reverse the name
    private static String reverse (String s, int start, int end) {
        return new StringBuilder(s.substring(start,end)).reverse().toString();
    }


}
