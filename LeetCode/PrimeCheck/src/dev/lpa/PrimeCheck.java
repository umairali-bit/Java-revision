package dev.lpa;

public class PrimeCheck {


    public static void main(String[] args) {

        int number = 9;

        boolean isPrime = isPrime(number);

        String result = (isPrime) ? number + " is a prime number " : number + " is not a prime number ";

        System.out.println(result);

    }

    public static boolean isPrime(int number) {


        if (number < 1) {
            return false;
        }

        for (int i = 2; i<=Math.sqrt(number); i++) {
            if( number % i == 0) {
                return false;
            }
        }
        return true;
    }



}
