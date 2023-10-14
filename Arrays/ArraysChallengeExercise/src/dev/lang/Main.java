package dev.lang;

import java.util.Arrays;
import java.util.Random;

public class Main {


    public static int[] listOfIntegers(int len){

        Random random = new Random();
        int[] arrayOfInt = new int[len];

        for(int i = 0; i < len; i++){
            arrayOfInt[i] = random.nextInt(1000);
        }
        return arrayOfInt;

    }

    private static int[] sortIntegers(int [] array){
        System.out.println(Arrays.toString(array));
        int[] sortedArray = Arrays.copyOf(array, array.length);

        //sorting in descending order
        boolean flag = true;
        int temp;

        while(flag){
            flag = false;

            for(int i = 0; i < sortedArray.length-1; i++){
                if (sortedArray[i] < sortedArray[i+1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                    System.out.println("-------->" + Arrays.toString(sortedArray));
                }
            }
            System.out.println("--->" + Arrays.toString(sortedArray));

        }
        return sortedArray;

    }


    public static void main(String[] args) {

        System.out.println(Arrays.toString(listOfIntegers(10)));
        int sortedArray[] = sortIntegers(new int[]{5,6,7});
        System.out.println(Arrays.toString(sortedArray));



    }


}


