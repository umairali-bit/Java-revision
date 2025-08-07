package dev.lpa;

public class NestedLoops {

    public static void main(String[] args) {


        // running a loop 10 times
        for (int count = 0; count <= 10; count++) {
            for (int i = 1; i < 6; i++) {
                System.out.print(i + " ");

            }
            System.out.println(" printed " + count);
        }

        for (int k = 0; k < 8; k++) {
            for (int j = 0; j <= k; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        outerLoop:
        for (int i = 0; i < 10; i++) {
            int j = 0;
            while (j <= 5) {
                if (j == 3) break;
                j++;
                System.out.print(j + " ");

            }
            System.out.println();
        }
    }
}
