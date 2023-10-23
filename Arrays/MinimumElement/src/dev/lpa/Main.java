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

    public static void main(String[] args) {
        int [] myArray = readIntegers();
        System.out.println(Arrays.toString(myArray));



        int returnedMin = findMin(myArray);
        System.out.println("min = "+returnedMin);


    }


}


