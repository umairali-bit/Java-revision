package Patterns;

public class Patterns {

    public static void sevenBySeven() {
        int n = 7;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void incrementI() {

        int n = 7;

        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void incrementIRight() {

        int n = 7;

        for (int i = 1; i <= n; i++) {

            // printing spaces
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void incrementMiddle() {

        int n = 7;

        for (int i = 1; i <= n; i++) {

            // printing spaces
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void incrementNumbers() {

        int n = 7;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void incrementNumbersRights() {

        int n = 7;

        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++) {
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

        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++) {
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

    public static void invertedRightAngledRight() {
        int n = 7;
        for (int i = 1; i < n; i++) {

            // spaces
            for (int s = 1; s < i; s++) {
                System.out.print(" ");
            }

            //stars
            for (int j = 1; j < n - i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

    public static void invertedRightAngledDigits() {
        int n = 7;
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void palindromicNumberPyramid() {
        int n = 7;
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }

            // left side: i down to 1
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            // right side: 2 up to i
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();


        }
    }

    public static void diamondPatternStar() {
        int n = 7;

        // top half
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // stars and spaces inside
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
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
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pyramidPatternStar() {

        int n = 4;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

    public static void hollowTrianglePattern() {
            int n = 4; // number of rows

            for (int i = 1; i <= n; i++) {
                // print leading spaces
                for (int j = i; j < n; j++) {
                    System.out.print(" ");
                }

                // print stars and spaces in between
                for (int j = 1; j <= (2 * i - 1); j++) {
                    if (j == 1 || j == (2 * i - 1) || i == n) {
                        System.out.print("*"); // border or base
                    } else {
                        System.out.print(" "); // hollow inside
                    }
                }
                System.out.println();
            }
        }
    }
