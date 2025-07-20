package dev.lpa;

public class MissingInteger {

    public static void main(String[] args) {

        System.out.println(new MissingInteger().solution(new int[]{1, 3, 6, 4, 1, 2}));

    }

    public int solution (int[] A) {
        int N = A.length;

        boolean[] seen = new boolean[N + 1];

        for (int num : A) {
            if (num > 0 && num <= N) {
                seen[num] = true;
            }
        }


        //find the first number missing from 1 to N
        for (int i = 1; i <= N; i++) {
            if (!seen[i]) {
                return i;
            }
        }

        return N + 1;


    }
}
