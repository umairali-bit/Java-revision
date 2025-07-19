package dev.lpa;

public class PermCheck {

    public static void main(String[] args) {

        PermCheck solver = new PermCheck();
        int[] A = {4,1,3,2};

        System.out.println("Array");
        printArray(A);

        System.out.println("\nIs it permutation");
        int a = solver.solution(A);
        System.out.println(a);


    }
}
