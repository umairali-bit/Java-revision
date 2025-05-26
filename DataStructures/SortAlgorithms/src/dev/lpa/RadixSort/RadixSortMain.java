package dev.lpa.RadixSort;

import java.util.Random;

public class RadixSortMain {


    public static void main(String[] args) {

        int[] newArray = generateArray();

        System.out.println("Before");
        printArray(newArray);

    }


    public static int[] generateArray() {

        Random random = new Random(10);
        int[] array = new int [10];

        for (int i = 0; i <array.length; i++) {
            array[i] = random.nextInt(100);
        }

        return array;

    }

    public static void printArray(int[] array) {

        for (int j : array) {
            System.out.print(j + " ");
        }

    }
}
