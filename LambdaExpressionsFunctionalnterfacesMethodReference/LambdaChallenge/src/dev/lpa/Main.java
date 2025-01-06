package dev.lpa;


import java.util.Arrays;
import java.util.Random;

/*
Create an array of String, which is populated with first names, in mixed case.
Include at least one name, which is spelled the same backwards, and forwards, like Bob, or Anna
Use Arrays.setAll, or List.replaceAll to change the values in this array
If List methods are used, a list backed by the array is needed, so that changes get made to the initial array

Using one of those two methods, perform the following functions on the elements in the array, with appropriate lambda expressions.

1) Transform names to all uppercase
2) Add a randomly generated middle initial and include a period
3) Add a last name that is the reverse of the first name
 */
public class Main {

    //Generating the random class and calling it Random
    private static Random random = new Random();

    public static void main(String[] args) {
        
    //creating an array of strings
        String[] firstNames = {"Bob", "Anna", "Harry","Hermione","Ron"};

      Arrays.setAll(firstNames , i -> firstNames[i].toUpperCase());
        System.out.println(Arrays.toString(firstNames));



    }
}
