package dev.lpa.InsertSort;

/*
Change insertion sort so that it uses recursion
Sort the usual example array
 */

public class InsertionSortChallenge {

    public static void main(String[] args) {

        int[] numbers = generateArray();


        System.out.println("Before");
        printArray(numbers);

        System.out.println("\nAfter");
        insertionSort(numbers, numbers.length);
        printArray(numbers);
    }


    public static void insertionSort(int[] numbersArr,int numItems){
        if (numItems < 2) {
            return;
        }

        insertionSort(numbersArr, numItems - 1);
            int newElement = numbersArr[numItems - 1];

            int i;

            for (i = numItems - 1; i > 0 && numbersArr[i - 1] > newElement; i--) {
                numbersArr[i] = numbersArr[i - 1];
            }

            numbersArr[i] = newElement;
    }

    public static int[] generateArray(){

        return new int[]{ 20, 25, -15, 7,55, 1, -22};
    }

    public static void printArray(int[] numbersArray) {

        for (int i = 0; i< numbersArray.length; i ++) {
            System.out.print(numbersArray[i] + " ");
        }
    }
}
