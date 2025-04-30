package dev.lpa.BubbleSort;

public class BubbleMain {

    public static void main(String[] args) {

    }







// implementation of the bubbleSort requires a swap()

public static void swap(int[] array, int i, int j) {


        if ( i == j) {
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;

    }

}


