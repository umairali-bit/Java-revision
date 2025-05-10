package dev.lpa.MergeSort;

public class MergeSortMain {

    public static void main(String[] args) {





    }


//    n! = n * (n - 1)! - recursive method to calculate the factorial ()

    public static int recursiveFactorial (int num) {

        if (num == 0) {
            return 1;
        }

        return num * recursiveFactorial(num - 1);

    }


//  method to calculate factorial in an iterative fashion - not using recursion

    public static int iterativeFactorial (int num) {

        if (num == 0) {
            return 1;
        }

        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;

        }

        return factorial;


    }

}
