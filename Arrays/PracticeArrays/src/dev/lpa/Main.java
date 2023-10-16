package dev.lpa;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int [] newArray = myInt();
        System.out.println(Arrays.toString(newArray));
        anotherInt(newArray);
        System.out.println(Arrays.toString(newArray));
        modifiedArray(newArray);
        System.out.println(Arrays.toString(newArray));


    }


    public static int[] myInt(){
        int [] myInt = new int[5];
        return myInt;
    }

    public static int[] anotherInt(int[] arr){
        arr[0] = 1;
        return arr;
    }

    public static int[] modifiedArray(int[] arr){
        arr[2] = 2;
        return arr;
    }
}
