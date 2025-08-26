package Patterns;

public class SevenBySeven {

    public static void sevenBySeven () {
        int n = 7;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j<= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }



}
