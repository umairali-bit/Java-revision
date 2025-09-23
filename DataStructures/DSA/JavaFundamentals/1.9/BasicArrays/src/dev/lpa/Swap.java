package dev.lpa;

import java.util.Arrays;

public class Swap {

    public static void main(String[] args) {

        int[] a = {1,3,5,2,4};

        System.out.println("Before swap: ");

        for (int num : a) {
            System.out.print(num + " ");
        }


        swap(a,0,3);


        System.out.println("\nAfter swap: ");
        for (int num: a) {
            System.out.print(num + " ");
        }


    }

    public static void swap(int[] arr, int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }


}
