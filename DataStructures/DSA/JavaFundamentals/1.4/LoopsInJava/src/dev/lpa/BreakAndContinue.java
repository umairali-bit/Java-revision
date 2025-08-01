package dev.lpa;

public class BreakAndContinue {
    public static void main(String[] args) {


        for (int i = 0; i <= 20; i += 2) {
            System.out.println(i);
            if(i >= 10) break;

        }

        int j = 0;
        while (j <= 5) {
            System.out.println(j);
            j++;

            if(j == 3) break;
        }

    }
}
