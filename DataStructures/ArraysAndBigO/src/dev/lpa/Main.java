package dev.lpa;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

//        review of Array

        int[] intArray = new int[7];

        intArray[0] = 20;
        intArray[1] = 35;
        intArray[2] = -15;
        intArray[3] = 7;
        intArray[4] = 55;
        intArray[5] = 1;
        intArray[6] = -22;


        int index = -1;
        for (int i = 0; i < intArray.length; i ++) {
//            System.out.print( intArray[i] + " ");

            if (intArray[i] == 7) {
//                System.out.println("index = " + i);
                index = i;
                break;
            }

        }

        System.out.println("index = " + index);

//    time complexity is O(n) here when we are retrieving an index

//      deleting an element from an array
        int[] nums = {10, 20, 30, 40, 50};
        int indexToRemove = 2; // remove the element 30
        System.out.println(Arrays.toString(nums));


        for (int i = indexToRemove; i < nums.length - 1; i++) {
            nums[i] = nums[i + 1];
        }

        System.out.println(Arrays.toString(nums));







    }
}
