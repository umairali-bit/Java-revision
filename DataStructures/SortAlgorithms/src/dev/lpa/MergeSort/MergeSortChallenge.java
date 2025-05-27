/*
Modify the merge sort algorithm so that it sorts integers in DESCENDING order
Use the usual example array

 */

package dev.lpa.MergeSort;

import java.util.Random;

public class MergeSortChallenge {

    public static void main(String[] args) {

        int[] numbers = generateArr();

        System.out.println("Before");
        printArray(numbers);

        System.out.println("\nAfter");
        mergeSort(numbers);
        printArray(numbers);

    }

    private static void mergeSort (int[] numbers) {

        int inputLength = numbers.length;

        if (inputLength < 2) {
            return;
        }

        int midIndex = inputLength / 2;

        int[] leftHalf = new int[midIndex];
        int[] rightHalf = new int[inputLength - midIndex];

//        for (int i = 0; i < midIndex; i++) {
//            leftHalf[i] = numbers[i];
//        }

        System.arraycopy(numbers, 0, leftHalf, 0, midIndex);

//        for (int i = midIndex; i<numbers.length; i++) {
//            rightHalf[i - midIndex] = numbers[i];
//        }

        if (numbers.length - midIndex >= 0)
            System.arraycopy(numbers, midIndex, rightHalf, midIndex - midIndex, numbers.length - midIndex);

        mergeSort(leftHalf);
        mergeSort(rightHalf);

        merge(numbers, leftHalf, rightHalf);

    }

    private static void merge (int[] numbers, int[] leftHalf, int[] rightHalf) {

        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;

        int i = 0, j = 0, k = 0;

        while ( i< leftSize && j < rightSize) {

            if (leftHalf[i] >= rightHalf[j]) {
                numbers[k] = leftHalf[i];
                i++;

            } else {
                numbers[k] = rightHalf[j];
                j++;
            }
            k++;
        }

        while (i< leftSize) {
            numbers[k] = leftHalf[i];
            i++;
            k++;
        }

        while (j < rightSize) {
            numbers[k] = rightHalf[j];
            j++;
            k++;
        }
    }


    private static int[] generateArr () {
        Random random = new Random();
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10);
        }
        return numbers;
    }


    private static void printArray (int[] numbers) {

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
