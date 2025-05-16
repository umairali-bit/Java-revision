package dev.lpa.MergeSort;

public class MergeSortMain {

    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};







    }

//  mergeSort method calls itself recursively
    public static void mergeSort(int[] intArray) {

        int inputLength = intArray.length;

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
            leftHalf[i] = intArray[i];
        }

        for (int i = midIndex; i < intArray.length; i++) {
            rightHalf[i - midIndex] = intArray[i];
        }


//  recursively calling mergeSort() on Left and Right Halves
        mergeSort(leftHalf);
        mergeSort(rightHalf);




    }


//  merge method to do merging steps
    private static void merge(int[] intArray, int[] leftHalf, int[] rightHalf) {

        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;

//  i is the iterator for the left half, j is the iterator for the right half, and k is the iterator for the merged arr
        int i = 0, j = 0, k = 0;


        while (i < leftSize && j < rightSize) {

            if (leftHalf[i] <= rightHalf[j]) {
                intArray[k] = leftHalf[i];
                i++;
            }
            else {
                intArray[k] = rightHalf[j];
                j++;
            }
            k++;
        }

//  accounting the elements that dont have a sibling array
        while (i < leftSize) {
            intArray[k] = leftHalf[i];
            i++;
            k++;
        }

        while (i < rightSize) {
            intArray[k] = rightHalf[i];
            j++;
            k++;
        }
    }

//  printing results
    private static void printArray (int[] numbers) {

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

    }


}
