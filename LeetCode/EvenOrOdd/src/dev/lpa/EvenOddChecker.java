package dev.lpa;

public class EvenOddChecker {

    public static void checkEvenOrOdd (int num){

       String result = (num % 2 == 0) ?  num + " is Even" : num + " is Odd";

        System.out.println(result);

    }
}
