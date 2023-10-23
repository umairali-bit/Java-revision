/*
Write a method called reverse that accepts an int array as a parameter. In the main method call the reverse method
and print the array in its original form and then print it in reverse form. To reverse the array, the element should be
swapped so that the first element is the last element and so on and so forth.
 */

package dev.lpa;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static int[] readIntegers(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a list of integers, separated by commas:");
        String input = sc.nextLine();

        String[] splits = input.split(",");
        int [] values = new int[splits.length];
        for(int i =0; i< splits.length; i++){
            values[i] = Integer.parseInt(splits[i].trim());
        }

        return values;


    }

    private static int findMin(int [] arr){
        int min = Integer.MAX_VALUE;

        for (int el : arr){
            if(el < min){
                min = el;

            }
        }
        return min;

    }

        private static void reverse(int [] arr) {

            int maxIndex = arr.length - 1;
            int halfLength = arr.length / 2;


            for (int i =0; i< halfLength; i++){
                int temp = arr[i];
                arr[i] = arr[maxIndex - i];
                arr[maxIndex - i] = temp;
                System.out.println("-->" + Arrays.toString(arr));
            }
        }





    public static void main(String[] args) {
        int [] myArray = readIntegers();
        System.out.println(Arrays.toString(myArray));



        int returnedMin = findMin(myArray);
        System.out.println("min = "+returnedMin);

        reverse(myArray);
        System.out.println("Final " + Arrays.toString(myArray));

    }


}