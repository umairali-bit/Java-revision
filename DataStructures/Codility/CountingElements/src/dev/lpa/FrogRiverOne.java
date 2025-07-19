package dev.lpa;

public class FrogRiverOne {

    public static void main(String[] args) {

        FrogRiverOne solver = new FrogRiverOne();

        int[] A = {1,3,1,4,2,3,5,4};
        int X = 5;

        System.out.println("Array");
        printArray(A);

        System.out.println("\nAll times are covered");
        int a = solver.solution(X, A);
        System.out.println(a);


    }

    public int solution (int X, int[] A) {
        //use a boolean array to track covered positions
        boolean[] seen = new boolean[X + 1];
        int uncovered = X;

        for (int i = 0; i < A.length; i++) {
            int pos = A[i];
            if (pos <= X && !seen[pos]) {
                seen[pos] = true;
                uncovered--;

                if (uncovered == 0) {
                    return i;
                }
            }
        }

        return -1;


    }

    public static void printArray(int[] A) {
        int a = A.length;

        for (int i = 0; i < a; i++) {
            System.out.print(A[i] + " ");
        }
    }
}
