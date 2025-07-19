package dev.lpa;

import java.util.Arrays;

public class OddOccurrenceInArray {

    public static void main(String[] args) {

        OddOccurrenceInArray solver = new OddOccurrenceInArray();
        int[] A = {9,3,9,3,9,7,9};

        System.out.println("Array");
        printArray(A);


        System.out.println("\nOdd occurrence");
        int a = solver.solution(A);
        System.out.println(a);

    }

    public int solution (int[] A) {

        int result = 0;

        for (int number: A) {
            result ^= number;
        }

        return result;

    }

    public static void printArray(int[] A) {

        int N = A.length;

        for (int i = 0; i < N; i++) {
            System.out.print(A[i] + " ");

        }
    }


}
