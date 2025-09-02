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

        for (int i = 1; i<n; i++) {
            for (int j = 1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void incrementIRight(){

        int n = 7;

         for (int i = 1; i<=n; i++) {

             // printing spaces
             for (int s = 1; s<=n-i; s++) {
                 System.out.print(" ");
             }

             for (int j = 1; j<=i; j++) {
                 System.out.print("*");
             }
             System.out.println();
         }
    }

    public static void incrementMiddle(){

        int n = 7;

        for (int i = 1; i<=n; i++) {

            // printing spaces
            for (int s = 1; s<=n-i; s++) {
                System.out.print(" ");
            }

            for (int j = 1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void incrementNumbers () {

        int n = 7;

        for (int i = 1; i<=n; i++) {
            for (int j = 1; j<=i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void incrementNumbersRights() {

        int n = 7;

        for (int i = 1; i<=n; i++) {
            for (int s = 1; s <= n-i; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void incrementNumbersMiddle() {

        int n = 7;

        for (int i = 1; i<=n; i++) {
            for (int s = 1; s <= n-i; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void diamondPattern() {
        int n = 7;

        // top half
        for (int i = 0; i <= n; i++) {
            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // stars and spaces inside
            for (int k = 0; k <= 2 * i; k++) {
                if (k == 0 || k == 2 * i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // bottom half
        for (int i = n - 1; i >= 0; i--) {
            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // stars and spaces inside
            for (int k = 0; k <= 2 * i; k++) {
                if (k == 0 || k == 2 * i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void invertedRightAngled() {
        int n = 7;
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }





}
