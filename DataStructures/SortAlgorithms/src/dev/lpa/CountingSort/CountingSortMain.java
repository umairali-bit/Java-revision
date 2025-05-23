package dev.lpa.CountingSort;

import java.util.Random;

public class CountingSortMain {


    public static void main(String[] args) {

        int[] intArray = generatingNumbers();

        System.out.println("Before");
        printArray(intArray);

        countingSort(intArray, 0, intArray.length-1);

        System.out.println("\nAfter");
        printArray(intArray);

    }

    private static void countingSort(int[] input, int min, int max) {

//  count array with the size of the actual array
        int[] countArray = new int[(max - min) + 1];

        for (int i = 0; i < input.length; i++) {
//  to count each value
           countArray[input[i] - min]++;
        }

//  writing values back to the array
    int j = 0;
        for (int i = min; i <=max; i++) {
            while (countArray[i - min] > 0) {
                input[j++] = i;
                countArray[i - min]--;

            }
        }

    }


    public static int[] generatingNumbers () {
        Random random = new Random();
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i ++) {
            numbers[i] = random.nextInt(10);

        }
        return numbers;

    }



    public static void printArray (int[] intArray){

        for (int i = 0; i < intArray.length; i ++) {
            System.out.print(intArray[i] + " ");
        }

    }


}



