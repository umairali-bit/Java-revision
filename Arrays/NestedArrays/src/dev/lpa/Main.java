package dev.lpa;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {

        //initializing two-dimensional arrays (nested arrays)
        int[][] array2 = new int[4][4]; //4 is the size of the array
        System.out.println(Arrays.toString(array2));
        System.out.println("array2.length = " + array2.length);
        System.out.println("-".repeat(20));

        //printing null elements in array2
        for(int[] outer : array2){
            //System.out.print(outer);
            System.out.println(Arrays.toString(outer));
        }

        //looping through the multidimensional array
        //i is the out loop, j is the inner loop
        for(int i = 0; i < array2.length; i++){
            var innerArray = array2[i];
            for(int j = 0; j< innerArray.length; j++){
                System.out.print(array2[i][j] + "");
            }
            System.out.println();
        }
        System.out.println("-".repeat(20));

        //another way to code the nested loop written above with forEach. var is used to let jvm know to choose the type

        for (var outer : array2){
            for(var element : outer){
                System.out.println(element + " ");
            }
            System.out.println();
        }
        System.out.println("-".repeat(20));

        //method that used print out all the elements of the array
        System.out.println(Arrays.deepToString(array2));
        System.out.println("-".repeat(20));


        //assigning elements to our multidimensional arrays
        for(int i = 0; i < array2.length; i++){
            var innerArray = array2[i];
            for(int j = 0; j< innerArray.length; j++){
                array2[i][j] = (i * 10) + (j + 1);
            }
        }
        System.out.println(Arrays.deepToString(array2));

    }
}
