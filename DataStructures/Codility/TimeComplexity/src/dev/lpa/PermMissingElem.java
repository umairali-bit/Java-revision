package dev.lpa;

import java.util.Arrays;

public class PermMissingElem {

    public static void main(String[] args) {

        int[] A = {2,3,1,5};

        PermMissingElem solver = new PermMissingElem();

        System.out.println("Array");
        printArray(A);

        System.out.println("\nMissing Element in Array");
        int a = solver.solution(A);
        System.out.println(a);



    }

    public int solution(int[] A) {

        long actualSum = 0;
        for (int number : A) {
            actualSum += number;//11
        }

        long maxNumber = A.length + 1;//5
        long expectedSum = (maxNumber * (maxNumber + 1)) / 2;//15
        return (int) (expectedSum - actualSum);//4

    }


        public static void printArray (int[] array) {

            for (int i = 0; i < array.length; i ++) {
                System.out.print(array[i] + " ");
            }
        }







    }





