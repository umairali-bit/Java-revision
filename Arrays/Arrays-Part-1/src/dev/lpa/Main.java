package dev.lpa;


public class Main {

    public static void main(String[] args) {

        //instantiating an array with 10 elements

        int[] myIntArray = new int[10];
        myIntArray[0] = 45; // setting element 1 in the array as 45;
        myIntArray[1] = 1;  // setting element 2 in the array as 1;
        myIntArray[5] = 50; //setting element 6 in the array as 50

        //OR

        int[] firstFivePositiveArrays = new int[]{1,2,3,4,5};

        // OR anonymous array
         int[] firstSixPositiveArrays = {1,2,3,4,5,6};
         String[] names = {"Umair", "Harry", "Jack" };

        double [] myDoubleArray = new double[10];
        myDoubleArray[2] = 3.5; // setting element 3 in the array as 3.5
        System.out.println(myDoubleArray[2]);

        int[] firstTen = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("first = "+ firstTen[0]);
        //to printout whole array length
        int arrayLength = firstTen.length;
        System.out.println("Length of the array = " +arrayLength);
        // to print out last element of the array
        System.out.println("Last = " +firstTen[arrayLength-1]);




        int newArray [];
        newArray = new int[]{5,4,3,2,1};
        //to print out an array
        for(int i = 0; i < newArray.length; i++ ){
            System.out.println(newArray[i] +" ");


        }


    }
}
