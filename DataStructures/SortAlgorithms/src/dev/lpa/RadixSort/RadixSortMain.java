package dev.lpa.RadixSort;

import java.util.Random;

public class RadixSortMain {


    public static void main(String[] args) {

        int[] newArray = generateArray();

        System.out.println("Before");
        printArray(newArray);

        System.out.println("\nAfter");





    }

//  this method will loop over each value in the index
    private static void radixSort(int[] array, int radix, int width) {
        for (int i = 0; i <width; i++) {
            radixSingleSort(array, i, radix);
        }
    }

    public static void radixSingleSort(int[] array, int position, int radix) {

        int numItems = array.length;

        int[] countArray = new int[radix];

        for (int value : array) {
            countArray[getDigit(position, value, radix)]++;
        }
//      Adjust the count array
        for (int j = 1; j < radix; j++) {
            countArray[j] += countArray[j - 1];
        }


        int[] temp = new int[numItems];
        for (int tempIndex = numItems - 1; tempIndex >= 0; tempIndex--) {
            temp[--countArray[getDigit(position, array[tempIndex], radix)]] =
                    array[tempIndex];
        }




    }

    public static int getDigit(int position, int value, int radix){
        return value / (int) Math.pow(10, position) % radix;
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
