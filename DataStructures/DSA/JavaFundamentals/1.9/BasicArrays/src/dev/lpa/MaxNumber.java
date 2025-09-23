package dev.lpa;

public class MaxNumber {

    public static void main(String[] args) {


        int[] a = {4, 3, 8, 2, 1, 7};

        System.out.println("Array elements:");
        for (int num : a) System.out.print(num + " ");

        int max = maxNumber(a);
        System.out.println("\nLargest number: " + max);
    }

    public static int maxNumber(int[] a) {
        if (a == null || a.length == 0) {
            throw new IllegalArgumentException("Array must not be empty");
        }

        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }





}
