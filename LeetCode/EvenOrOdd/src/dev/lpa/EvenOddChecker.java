package dev.lpa;

public class EvenOddChecker {

    public static void checkEvenOrOdd (int num){

       String result = (num % 2 == 0) ? "Even" : "Odd";

        System.out.println(result);

    }
}
