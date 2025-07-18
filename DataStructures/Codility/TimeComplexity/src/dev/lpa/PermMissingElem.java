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

        Arrays.sort(A);

        for (int x = 0; x < A.length; x++ ) {
           if(A[x] != x + 1){
                return x + 1;

            }

            }
        return A.length + 1;

        }


        public static void printArray (int[] array) {

            for (int i = 0; i < array.length; i ++) {
                System.out.print(array[i] + " ");
            }
        }







    }





