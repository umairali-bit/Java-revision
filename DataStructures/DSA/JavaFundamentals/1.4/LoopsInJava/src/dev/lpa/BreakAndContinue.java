package dev.lpa;

public class BreakAndContinue {
    public static void main(String[] args) {


        for (int i = 0; i <= 20; i += 2) {

        }

        int j = 0;
        while (j <= 5) {
            System.out.println(j);
            j++;

            if(j == 3) break;
        }


        for (int k = 0; k <= 20; k += 1) {
            if (k == 2 || k == 10) continue;
            if (k == 15) break;
            System.out.println("Toffee was distributed to " + k);
        }

    }
}
