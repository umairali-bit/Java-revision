package dev.lpa;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int [] newArray = new int[5];
        //populating the array through a loop
        for(int i = 0; i< newArray.length; i++ ){
            newArray[i] = newArray.length -i;
        }

        for (int i = 0; i< newArray.length; i++){
           System.out.print(newArray[i] + " ");

        }
        System.out.println();




        //enhanced for loop
        for(int element : newArray){
            System.out.print(element + " ");
        }
        System.out.println();

        //to print out array using Java.util.Arrays
        System.out.println(Arrays.toString(newArray));
        //assigning an array to an object variable
        Object objectVariable = newArray;

        //test if objectVariable is an int[]
        if(objectVariable instanceof int[]){
            System.out.println("ObjectVariable is really an int array");
        }


        Object[] objectArray = new Object[3];
        objectArray[0] = "Hello";
        objectArray[1] = new StringBuilder("World");
        objectArray[2] = newArray; //nested array


    }
}
