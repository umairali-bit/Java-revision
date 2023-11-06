package dev.lpa;

import java.util.Arrays;

public class Main {

    private static void reverse(int[] arr){

        System.out.println("Array = " + Arrays.toString(arr));

        int maxIndex = arr.length -1;
        int halfLength = arr.length /2;

        for(int i = 0; i <halfLength; i++ ){

            int temp = arr[i];
            arr[i] = arr[maxIndex - i];
            arr[maxIndex - i] = temp;

        }
        System.out.println("Reversed array = " + Arrays.toString(arr));


    }


    public static void main(String[] args) {

        int [] arr = {4,2,6,7,1};
        reverse(arr);

    }





}



