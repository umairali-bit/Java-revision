package dev.lpa;

public class Equilibrium {

    public static void main(String[] args) {

        Equilibrium solver = new Equilibrium();

        int[] A = {3,1,2,4,3};

        System.out.println("Array");
        printArray(A);

        System.out.println("Equilibrium");
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
        for (int i = 0; i < aLength; i++) {
            leftSum += A[i];
        }

    }


    public static void printArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

        }
    }


}
