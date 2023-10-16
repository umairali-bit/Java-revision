package dev.lpa;

import java.util.Arrays;

public class Main{


    public static void main(String[] args) {

        // array has 5 variables
        // variable myIntArray has the address to the object array that has 5 elements

        int [] myIntArray = new int[5];
        int [] anotherArray = myIntArray;

        System.out.println("myIntArray = "+ Arrays.toString(myIntArray));
        System.out.println("anotherArray = "+ Arrays.toString(myIntArray));

        anotherArray[0] = 1;
        modifierArray(myIntArray);

        //myIntArray,anotherArray is pointing to the same object in memory
        System.out.println("after change myIntArray = "+ Arrays.toString(myIntArray));
        System.out.println("after change anotherArray = "+ Arrays.toString(anotherArray));


    }


    private static void modifierArray(int [] array){
        array[1] =2;
    }







}
