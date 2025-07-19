package dev.lpa;

import java.util.Arrays;

public class OddOccurrenceInArray {

    public static void main(String[] args) {

        int[] A = {9,3,9,3,9,7,9};

        OddOccurrenceInArray solver = new OddOccurrenceInArray();

        int[] a = solver.solution(A);
        System.out.println(Arrays.toString(a));

    }


}
