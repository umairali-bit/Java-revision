package dev.lpa.SelectionSort;

public class SelectionSortMain {

    public static void main(String[] args) {


        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

        for (int lastUnsortedIndex = intArray.length -1; lastUnsortedIndex > 0; lastUnsortedIndex--) {

            int largestIndex = 0;

            for (int i = 1; i <= lastUnsortedIndex; i ++) {

                if (intArray[i] > largestIndex) {
                    largestIndex = i;
                }
            }


        }

    }

    public static void swap (int[] arr, int i, int j) {

        if (i == j) {
            return;
        }

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }





}
