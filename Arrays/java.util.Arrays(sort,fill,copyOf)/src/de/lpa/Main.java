package de.lpa;
import java.util.Arrays;
import java.util.Random; //to return random numbers

public class Main {

    //method that will return an array of random integers
    private static int[] getRandomArray(int len){
        //to return random numbers
        Random random = new Random();
        int[] newInt = new int[len];

        //assign a random number to each element in the array under 100
        for(int i = 0; i <len; i++){
            newInt[i] = random.nextInt(100);
        }

        return newInt;
        }



    public static void main(String[] args) {

        int[] firstArray = getRandomArray(10);
        //to strong method because we are using static method
        System.out.println(Arrays.toString(firstArray));

        //to get a sorted array
        Arrays.sort(firstArray);
        System.out.println(Arrays.toString(firstArray));


        //to populate an array with the same element we use fill()
        int[] secondArray = new int[10];
        System.out.println(Arrays.toString(secondArray));// output 10 zeros
        Arrays.fill(secondArray,5);
        System.out.println(Arrays.toString(secondArray));// output 10 fives



    }
}
