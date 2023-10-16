package dev.lpa;


public class PrintArray {

    public static void printArray(int[] array){ //only static would not be allowed here cuz we can't return an array
        for(int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }

    }
}
