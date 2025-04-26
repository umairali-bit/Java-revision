package dev.lpa;


import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int maxValue = Integer.MAX_VALUE - 5;

//      Math.incrementExact(id)
        for (int j = 0, id = maxValue; j < 10; j++, id ++ ) //id = Math.incrementExact(id)) {
        {
            System.out.printf("Assigning id %,d%n", id);
        }


//      abs, returns the magnitude of a number ignoring its sign.
        System.out.println(Math.abs(-50));

//        getting the Integer MinValue
        System.out.println(Math.abs(Integer.MIN_VALUE)); // -2147483648
        System.out.println(Math.abs((long) Integer.MIN_VALUE)); //2147483648


        System.out.println("Max = " + Math.max(10, -10));
        System.out.println("Min = " + Math.min(10.0000002, 10.001));
        System.out.println("Min = " + Math.min(10.0000002f, 10.001f));


        System.out.println("Round Down = " + Math.round(10.2));
        System.out.println("Round Up = " + Math.round(10.8));
        System.out.println("Round ? = " + Math.round(10.5));

//      Floor will always round up, Ceil will always round down
        System.out.println("Floor = " + Math.floor(10.8));
        System.out.println("Ceil = " + Math.ceil(10.2));

//      sqrt, and pow methods
        System.out.println("Square root of 100 = " + Math.sqrt(100));
        System.out.println("2 to the third power (2x2x2) = " + Math.pow(2,3));
        System.out.println("10 to the fifth power (10x10x10x10x10) = " + Math.pow(10,5));


//      Math.random()
        for (int i = 0; i < 10; i ++) {
            System.out.println(Math.random());

        }

        /*
        0.9524069173210151
        0.9560177482366994
        0.6761617916731141
        0.7878079734145225
        0.9389765549066796
        0.606371867885008
        0.1971184466989454
        0.8465325352321285
         */

//        generating numbers 1 - 9
        for (int i = 0; i < 10; i++) {
            System.out.print((int) (Math.random() * 10) + " "); //0 2 3 5 9 4 5 8 3 0
        }

        System.out.println();

//        generating numbers 1 - 10
        for (int i = 0; i < 10; i++) {
            System.out.print((int) (Math.random() * 10) + 1+ " "); //4 9 1 6 5 5 7 8 4 10
        }

//        generating numbers and characters they represents
        for (int i = 0; i < 10; i++) {
            System.out.printf("%1$d = %1$c%n", (int) (Math.random() * 26) + 65);
        }

        System.out.println();

//        generating numbers and characters they represent using a method on Random class
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            System.out.printf("%1$d = %1$c%n", r.nextInt(65, 91)); //included in JDK17
        }

        System.out.println();

//        generating letters between Capital A and Capital Z
        for (int i =0; i < 10; i++) {
            System.out.printf("%1$d = %1$c%n", r.nextInt((int) 'A', (int) 'Z'));
        }

        System.out.println();

//        generating numbers between -10 and 11
        for (int i = 0; i < 10; i++) {
            System.out.printf("%1$d%n", r.nextInt(-10, 11));
        }

        System.out.println();

//        generating numbers in stream
        r.ints()
                .limit(10)
                .forEach(System.out::println);











    }
}