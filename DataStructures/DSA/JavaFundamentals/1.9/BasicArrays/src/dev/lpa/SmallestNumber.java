package dev.lpa;

public class SmallestNumber {

    public static void main(String[] args) {

        int[] a = {4,3,8,2,1,7};

        System.out.println("\nArray elements: ");
        for (int num : a) System.out.print(num + " ");

        int min = smallestNumber(a);
        System.out.println("\nSmallest number: " + min);



    }

    public static int smallestNumber (int[] a) {
        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }

        return min;

    }
}
