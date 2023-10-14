package dev.lap;
import java.util.Scanner;

public class getIntegers {

    public static int[] getIntegers(int arraySize){

        Scanner sc = new Scanner(System.in);
        int values[] = new int[arraySize];


        for (int i = 0; i<values.length; i++){
            System.out.println("Please enter #" + i);
            values[i] = sc.nextInt();

        }
        return values;

    }
}
