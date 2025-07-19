package dev.lpa;

import java.util.Arrays;

public class CyclicRotation {

    public static void main(String[] args) {

        int[] A = {3,8,9,7,6};
        int K = 3;

        CyclicRotation solver = new CyclicRotation();
        int[] s = solver.solution(A,K);
        System.out.println(Arrays.toString(s));

    }

    public int[] solution(int[] A, int K) {

        int N = A.length;

        if (N == 0) return A;

        //if K is larger than N
        K = K % N;

        if (K == 0) return A;

        int[] rotated = new int[N];

        // copy last K elements to the beginning of rotated array
        for (int i = 0; i < K; i++) {
            rotated[i] = A[N - K + i];
        }

        //copy the rest of elements after K to the rotated array
        for (int i = K; i < N; i++) {
            rotated[i] = A[i -K];
        }

        return rotated;



    }
}
