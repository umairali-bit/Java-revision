package dev.lpa.RadixSort;

import java.util.Random;

public class RadixSortMain {


    public static void main(String[] args) {

        int[] newArray = generateArray();

        System.out.println("Before");
        printArray(newArray);

    }


    private static void radixSort(int[] array, int radix, int width) {
        for (int i = 0; i <width; i++) {
            radixSingleSort(array, i, radix);
        }
    }


    public static int[] generateArray() {

        Random random = new Random(10);
        int[] array = new int [10];

        for (int i = 0; i <array.length; i++) {
            array[i] = random.nextInt(1000, 1900);
        }

        return array;

    }

    public static void printArray(int[] array) {

        for (int j : array) {
            System.out.print(j + " ");
        }

    }
}
