package dev.lpa.MergeSort;

public class MergeSortMain {

    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};




//  printing the result

        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }


    }

//  mergeSort method calls itself recursively
    public static void mergeSort(int[] input, int start, int end) {

        //breaking out of recursion
        if (end - start < 2) {
            return;
        }
//  Start = 0, end = 7 (array.length) (0 + 7) /2 = 3
        int mid = (start + end) / 2;
//  20, 35, -15 - left side of the array
        mergeSort(input, start, mid);
//  right side of the array - indices 3 - 6
        mergeSort(input, mid , end);






    }


//    merge method to do merging steps
}
