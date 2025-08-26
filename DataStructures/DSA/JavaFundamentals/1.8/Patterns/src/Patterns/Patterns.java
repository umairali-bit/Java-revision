package Patterns;

public class Patterns {

    public static void sevenBySeven () {
        int n = 7;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j<= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void incrementI () {

        int n = 7;

        for (int i = 1; i<=n; i++) {
            for (int j = 1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }



}
