public class challenge {

    public static void main(String[] args) {


        // using ternary operator, first it will check if the number is prime or not if yes it will say a prime number
        // if not, it will slip NOT in quotation marks

        System.out.println("0 is " + (isPrime(0) ? "" : "NOT ") + "a prime number");
        System.out.println("1 is " + (isPrime(1) ? "" : "NOT ") + "a prime number");
        System.out.println("2 is " + (isPrime(2) ? "" : "NOT ") + "a prime number");
        System.out.println("3 is " + (isPrime(3) ? "" : "NOT ") + "a prime number");


        System.out.println("8 is " + (isPrime(8) ? "" : "NOT ") + "a prime number");
        System.out.println("17 is " + (isPrime(17) ? "" : "NOT ") + "a prime number");


        System.out.println("********************************************************************");

        counter();
        totalCount();


    }


    // checking if numbers are prime or not
    public static boolean isPrime(int wholeNumber) {


        if (wholeNumber <= 2) {
            return (wholeNumber == 2);
        }

        for (int divisor = 2; divisor <= wholeNumber / 2; divisor++) {

            if (wholeNumber % divisor == 0) {
                return false;
            }

        }

        return true;

    }

    // counting and printing out prime numbers between 10 and 50

    public static void counter() {

        int count = 0;
        System.out.println("Three prime numbers between 10 and 50 are ");

        /*
        quicker version 
        for (int i = 10; count < 3 && i <= 50; i++){}
         */

        for (int i = 10; i <= 50; i++) {


            if (isPrime(i)) {
                System.out.println("number " + i + " is a prime number ");
                count++;
            }


            if (count == 3) {
                break;
            }

        }


    }


    public static void totalCount() {
        int totalCount = 0;


        for (int i = 10; i <= 50; i++) {


            if (isPrime(i)) {
                totalCount++;
            }


        }
        System.out.println("The total prime numbers between 10 and 50 are " + totalCount);
    }



}





