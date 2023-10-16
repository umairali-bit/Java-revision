package dev.lpa;

public class Main {

    public static void main(String[] args) {

        //creating an array
        int [] array = new int[5]; //5 is the length of the array


        //initializing an array line
        int [] myNumbers = {5,4,3,2,1};

        //initializing an array with length and elements
        int[] myArray;
        myArray= new int[]{5,4,3};


        //to avoid arraysOutOfBoundException and other errors use enhanced for loops
        int [] realArray = {5,4,3,2,1};
        for(int myInt : realArray){
            System.out.println("Value = " +myInt);
        }

        //traditional for loops
        int [] numberArray = {5,4,3,2,1};
        for (int i = 0; i <numberArray.length; i++ ){
            System.out.println("Value = "+numberArray[i]);
        }

    }
}
