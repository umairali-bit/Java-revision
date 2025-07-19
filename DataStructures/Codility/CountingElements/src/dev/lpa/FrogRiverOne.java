package dev.lpa;

public class FrogRiverOne {

    public static void main(String[] args) {

        FrogRiverOne solver = new FrogRiverOne();

        int[] A = {1,3,1,4,2,3,5,4};

        System.out.println("Array");
        printArray(A);

        System.out.println("\nAll times are covered");
        int a = solver.solution(A);


    }
}
