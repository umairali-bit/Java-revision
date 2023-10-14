package dev.lap;


public class printArray {

    public static void printArray(int[] array){ //only static would not be allowed here cuz we cant retrun an array
        for(int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }

    }
}
