package dev.lpa;

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





    }
}
