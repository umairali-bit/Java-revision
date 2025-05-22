package dev.lpa.QuickSort;

import java.util.Random;

public class QuickSortMain {

    public static void main(String[] args) {

//        int[] randomArray = generatingNumbers();
//        printArray(randomArray);

        printArray();


    }

    public static int[]  generatingNumbers () {

        Random rand = new Random();
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100);

        }
        return numbers;


    }

    public static void printArray() {

        int[] array = generatingNumbers();

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }



    }
}
