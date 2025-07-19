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

    public int solution(int[] A) {
        int N = A.length;

        boolean[] seen = new boolean[N + 1];

        for (int num : A) {
            if (num < 1 || num > N) {
                return 0; // out of range
            }

            if (seen[num]) {
                return 0; // duplicate found
            }
            seen[num] = true;
        }

        return 1; //All numbers from 1 to N are present



    }


    public static void printArray (int[] A) {

        int a = A.length;

        for (int i = 0; i < a; i++) {
            System.out.print(A[i] + " ");
        }
    }
}
