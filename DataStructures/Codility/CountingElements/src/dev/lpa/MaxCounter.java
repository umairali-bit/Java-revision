package dev.lpa;

import java.util.Arrays;

public class MaxCounter {

    public static void main(String[] args) {



        int[] A = {3,4,4,6,1,4,4};

        int N = 5;

        System.out.println("Initial Array");
        printArray(A);

        System.out.println("\nmax counters:");

        System.out.println(Arrays.toString(new MaxCounter().solution(N, A)));

    }

    public int[] solution (int N, int[] A) {

        int[] counters = new int[5];
        Arrays.fill(counters, 0);
        int start = 0;
        int current_max = 0;

        for (int i : A) {

            int x = i - 1;
            if (i > N){
                start = current_max;
            } else if (counters[x] < start) {
                counters[x] = start + 1;
            } else {
                counters[x] += 1;
            } if (i <= N && counters[x] > current_max) {
                current_max = counters[x];
            }

            for (int j = 0; j < counters.length; j++) {
                if (counters[j] < start) {
                    counters[j] = start;
                }
            }


        }
        return counters;

    }

    public static void printArray (int[] A) {
        int a = A.length;

        for (int i = 0; i < a; i++) {
            System.out.print(A[i] + " ");
        }
    }



}
