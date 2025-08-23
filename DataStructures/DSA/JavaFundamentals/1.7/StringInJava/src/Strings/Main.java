package Strings;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //declaring a String
        String name = "Walter White"; //String literal
        String sameName = "Walter White";

        String nameA = new String("Walter White");
        String nameB = new String("Walter White");

        /*
        Memory - Stack and Heap
        Stack - references
        Heap - String Constant Pool - Object

        Stack - name (reference)
        name (reference) -> heap -> String Constant Pool -> Walter White

        Stack - nameA (reference)
        nameA -> heap -> (without String Constant Pool) -> Walter White

        Strings are immutable

        String are immutable but its objects are mutable

       String name = "Walter White"
       name = "Skyler White"

       now name is pointing to another object
       Garbage collector will later erase "walter white"
         */

        //to check if references are equal
        if (name == sameName) {
            System.out.println("References are equal");

            if (nameB == nameA) {
                System.out.println("References are equal");

            }
            else {
                System.out.println("References are not equal");

            }

        } else {
            System.out.println("References are not equal");

        }


        //to check if values in references are equal or not
        if (nameA.equals(nameB)) {
            System.out.println("Values are equal");
        } else {
            System.out.println("Values are not equal");

        }

        Scanner names = new Scanner(System.in);
        System.out.println("Enter your first name");
        String fName = names.nextLine();

        System.out.println("Enter your last name");
        String lName = names.nextLine();

        System.out.println(fName + " " + lName);






    }
}
