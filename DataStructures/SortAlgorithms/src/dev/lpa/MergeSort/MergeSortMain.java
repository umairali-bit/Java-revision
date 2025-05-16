package dev.lpa.MergeSort;

public class MergeSortMain {

    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};







    }

//  mergeSort method calls itself recursively
    public static void mergeSort(int[] inputArray) {

        int inputLength = inputArray.length;

//  {22}{35}{-15}{7}{55}{1}{-22} - if we dont have a single array break out of recursion
        if (inputLength < 2) {
            return;
        }
//  int midIndex = inputLength/2
        int midIndex = inputLength / 2;

//  declaring left and right arrays and their sized

        int[] leftHalf = new int[midIndex];
        int[] rightHalf = new int [inputLength - midIndex];

//  Populating left and right arrays

        for (int i = 0; i < midIndex; i++) {
            leftHalf[i] = inputArray[i];
        }

        for (int i = midIndex; i < inputArray.length; i++) {
            rightHalf[i - midIndex] = inputArray[i];
        }


//  recursively calling mergeSort() on Left and Right Halves
        mergeSort(leftHalf);
        mergeSort(rightHalf);




    }


//    merge method to do merging steps

    public static void merge(int[] input, int start, int mid, int end) {

        if (input [mid - 1] <= input [mid]) {
            return;
        }


    }


}
