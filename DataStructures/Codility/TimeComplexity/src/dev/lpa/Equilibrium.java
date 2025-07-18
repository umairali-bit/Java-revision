package dev.lpa;

public class Equilibrium {

    public static void main(String[] args) {

        Equilibrium solver = new Equilibrium();

        int[] A = {3,1,2,4,3};

        System.out.println("Array");
        printArray(A);

        System.out.println("\nMinimal difference:");
        int a = solver.solution(A);
        System.out.println(a);


    }

    public int solution(int[] A) {

        int aLength = A.length;

        if (aLength < 2) {
            return 0;
        }

        //first find the total
        int totalSum = 0;
        for (int x : A) {
            totalSum += x;
        }

        int minDiff = Integer.MAX_VALUE;
        int leftSum = 0;

        //getting the leftSum
        for (int i = 0; i < aLength-1; i++) {
            leftSum += A[i];

            //getting the right sum
            int rightSum = totalSum - leftSum;

            //getting the current difference at any particular point
            int diff = Math.abs(leftSum - rightSum);

            //getting the smallest diff
            minDiff = Math.min(minDiff, diff);
        }

        return minDiff;

    }


    public static void printArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

        }
    }


}
