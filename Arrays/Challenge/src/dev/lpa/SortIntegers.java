package dev.lpa;

import java.util.Arrays;

public class SortIntegers {

    public static int[] sortIntegers(int[] array){

        System.out.println(Arrays.toString(array));


        int [] sortedIntegers = new int[array.length];
        for(int i = 0; i < array.length; i++){
            sortedIntegers[i] = array[i];
        }

        boolean flag = true;
        int temp;

        while(flag){
            flag = false;

            for (int i = 0; i<sortedIntegers.length-1; i++){
                if(sortedIntegers[i] < sortedIntegers[i+1]){
                    temp = sortedIntegers[i];
                    sortedIntegers[i] = sortedIntegers[i+1];
                    sortedIntegers[i+1] = temp;
                    flag = true;

                }

            }

        }
        System.out.println("Sorted list:");
        System.out.println(Arrays.toString(sortedIntegers));
        return sortedIntegers;
    }
}
