package dev.lpa.SortingArray;

import java.util.Arrays;
import java.util.Random;

public class SortingArrayMain {

    public static void main(String[] args) {

        int[] array = generateArray();

        System.out.println("Before");
        printArray(array);

        System.out.println("\nAfter");
        Arrays.sort(array);
        printArray(array);


    }


    public static int[] generateArray() {

        Random random = new Random(10);
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(-22, 55);
        }
        return array;
    }


    public static void printArray(int[] array) {

        for (int i : array) {
            System.out.print(i + " ");


        }
    }
}
