package dev.lpa.Recursion;

public class RecursionMain {

    public static void main(String[] args) {

        System.out.println(recursiveFactorial(3));

        System.out.println(iterativeFactorial(3));

    }

//        n! = n * (n - 1)! - recursive method to calculate the factorial()

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
