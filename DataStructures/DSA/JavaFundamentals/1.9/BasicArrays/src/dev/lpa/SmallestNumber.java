package dev.lpa;

public class SmallestNumber {

    public static void main(String[] args) {

        int[] a = {4,3,8,2,1,7};

        System.out.println("\nBefore: ");
        for (int num: a) System.out.print(num+" ");

        System.out.println("\nAfter: ");
        for (int num: a) System.out.print(num+" ");

        smallestNumber(a);

    }

    public static void smallestNumber (int[] a) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < max) {
                max = a[i];
            }
        }
        System.out.println("min: " + max);
    }
}
