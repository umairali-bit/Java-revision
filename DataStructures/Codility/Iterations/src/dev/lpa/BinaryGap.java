package dev.lpa;

public class BinaryGap {

    public static void main(String[] args) {

        int N = 1041;
        int N2 = 32;

        BinaryGap solver = new BinaryGap();

        int a = solver.solution(N);
        System.out.println(a);


    }

    public int solution (int N) {

        //convert number into binary
        String binary = Integer.toBinaryString(N);

        int maxGap = 0;
        int currentGap = 0;
        boolean counting = false;

        for (char c : binary.toCharArray()) {
            if (c == '1') {
                if (counting) {
                    maxGap = Math.max(maxGap, currentGap);
                    currentGap = 0;//reset for next potential gap
                }
                counting = true;// start counting after first '1'

            } else if (counting) {
                //only count zeros if we're between ones
                currentGap++;
            }
        }

        return maxGap;



    }
}
