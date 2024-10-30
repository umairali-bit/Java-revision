package dev.lpa;

public class greatestNumber {

    public static void main(String[] args) {



        int number1 = 20;
        int number2 = 10;

        testGreatestNumber(number1,number2);


    }

    public static void testGreatestNumber (int num1, int num2) {


        String result = (num1 > num2) ? "number 1 is the greatest " : (num2 > num1) ? " number 2 is the reatest" :  "both are equal";
        System.out.println(result);
    }
}
