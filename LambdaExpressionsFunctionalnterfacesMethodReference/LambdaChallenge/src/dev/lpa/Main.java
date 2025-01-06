package dev.lpa;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/*
Create an array of String, which is populated with first names, in mixed case.
Include at least one name, which is spelled the same backwards, and forwards, like Bob, or Anna
Use Arrays.setAll, or List.replaceAll to change the values in this array
If List methods are used, a list backed by the array is needed, so that changes get made to the initial array
Use for.each loop once in the challenge

Using one of those two methods, perform the following functions on the elements in the array, with appropriate lambda expressions.

1) Transform names to all uppercase
2) Add a randomly generated middle initial and include a period
3) Add a last name that is the reverse of the first name

Create a new modifiable ArrayList from your names array, removing any names where the last name equals the first name
 */
public class Main {

    //Generating the random class and calling it Random
    private static Random random = new Random();

    public static void main(String[] args) {

    //creating an array of strings
        String[] firstNames = {"Bob", "Anna", "Harry","Hermione","Ron"};

      Arrays.setAll(firstNames , i -> firstNames[i].toUpperCase());
        System.out.println(Arrays.toString(firstNames));

        /*
        List backedByArray, treating an array like a list
         */
        List<String> backedByArray = Arrays.asList(firstNames);
        System.out.println(Arrays.toString(firstNames));

        //testing getRandomChar()
        char middle = getRandomChar('A', 'E');
        System.out.println(middle);

        //Add a randomly generated middle initial and include a period
        backedByArray.replaceAll(s-> s += " " + getRandomChar('A','D') + ".");
        System.out.println(Arrays.toString(firstNames));

        //Add a last name that is the reverse of the first name
        backedByArray.replaceAll(s-> s += " " + getReversedName(s.split(" ")[0]));
        //System.out.println(Arrays.toString(firstNames));

        //Using for.each loop once in the challenge
        Arrays.asList(firstNames).forEach(s-> System.out.println(s));


        /*
        Create a new modifiable ArrayList from your names array, removing any names where the last name equals
        the first name
         */
        //creating a copy of the firstNames array
        List <String> newList = new ArrayList<>(List.of(firstNames));
        //checking if the first name is equal to the last name. checking from 1st space to the last.
        /*
        newList.removeIf(s-> s.substring(0, s.indexOf(" ").equals(s.substring(s.lastIndexOf(" ")+1));
         */
        newList.removeIf(s-> {
            String first = s.substring(0, s.indexOf(" "));
            String last = s.substring(s.lastIndexOf(" ")+1);
            return first.equals(last);
        });
        System.out.println(newList);
    }

    public static char getRandomChar (char startChar, char endChar) {
        return (char) random.nextInt((int) startChar, (int) endChar+1); //endChar + 1 so that the characters passed to this method are included

    }

    public static String getReversedName (String firstNames) {
        return new StringBuilder(firstNames).reverse().toString();
    }
}
