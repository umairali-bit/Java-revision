package dev.lpa.QuickSort;

import java.sql.SQLOutput;
import java.util.Random;

public class QuickSortMain {

    public static void main(String[] args) {

        int[] randomArray = generatingNumbers();
//        printArray(randomArray);

        System.out.println("Before: ");
        printArray(randomArray);

        quickSort(randomArray, 0, randomArray.length - 1);

        System.out.println("\nAfter:");
        printArray(randomArray);

    }

    private static void quickSort(int[] array, int lowIndex, int highIndex) {

        if (lowIndex >= highIndex) {
            return;
        }

//      to choose any number as a pivot from the array
        int pivotIndex = new Random().nextInt(highIndex - lowIndex) + lowIndex;
        int pivot = array[pivotIndex];
        swap(array, pivotIndex, highIndex);

        int i = lowIndex, j = highIndex;

        while (i < j) {

            while (array[i] <= pivot && i < j) {
                i++;
            }

            while (array[j] >= pivot && i < j) {
                j--;
            }
            swap(array, i, j);
        }
        swap(array, i, highIndex);

        quickSort(array, lowIndex, i - 1);
        quickSort(array, i + 1, highIndex);

    }

    private static void swap (int[] array, int index1, int index2) {

        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;


    }

    public static int[] generatingNumbers () {

        Random rand = new Random();
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100);

        }
        return numbers;


    }

    public static void printArray(int[] array) {



        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }



    }
}
