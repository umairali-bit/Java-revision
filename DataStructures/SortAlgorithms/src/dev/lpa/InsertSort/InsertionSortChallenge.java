package dev.lpa.InsertSort;

/*
Change insertion sort so that it uses recursion
Sort the usual example array
 */

public class InsertionSortChallenge {

    public static void main(String[] args) {

        int[] numbers = generateArray();

        printArray(numbers);

    }


    public static int[] generateArray(){

        int[] numbers = { 20, 25, -15, 7,55, 1, -22};

        return numbers;
    }


    public static void printArray(int[] numbers) {

        for (int i = 0; i< numbers.length; i ++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
