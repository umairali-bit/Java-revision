package dev.lpa.PracPermMissingElem;

import dev.lpa.PermMissingElem;

import java.sql.SQLOutput;

public class MissingNumber {

    public static void main(String[] args) {
        int[] nums = {3, 0, 1};

        MissingNumber solver = new MissingNumber();


        System.out.println("Array");

        printArray(nums);

        System.out.println("\nMissing Element in Array");
        int a = solver.solution(nums);
        System.out.println(a);

    }

    public int solution(int[] nums) {

        int n = nums.length;
        long totalSum = 0;

        for (int num: nums) {
            totalSum += num;

        }

        long maxNumber = nums.length;
        long expectedSum = (maxNumber * (maxNumber + 1)) / 2;
        return (int) (expectedSum - totalSum);
    }




    public static void printArray (int[] array) {

        for (int i = 0; i < array.length; i ++) {
            System.out.print(array[i] + " ");
        }
    }


}
