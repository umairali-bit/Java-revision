package dev.lpa;

public class MaxCounter {

    public static void main(String[] args) {

        MaxCounter solver = new MaxCounter();

        int[] A = {3,4,4,6,1,4,4};

        System.out.println("Initial Array");
        printArray(A);

        int[] a = solver.solution(N, A);
        System.out.println("Max Counter[] = " + a);

    }


}
