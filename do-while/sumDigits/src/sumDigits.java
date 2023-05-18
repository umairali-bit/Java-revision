public class sumDigits {

    // n % 10= least significsant digit
    // n = n/10 to drop last digit

    // Challenge is to add the digits in a number for example 1234 is 1+2+3+4 = 10


    public static void main(String[] args) {

        System.out.println("The sum of the digits in number 1234 is " + sumDigits(1234));
        System.out.println("The sum of the digits in number - 1234 is " + sumDigits(-1234));
       
    }

    public static int sumDigits(int number){




        if (number < 0) {
            return -1;
        }
        int sum = 0;

        while (number > 9 ) { // to get double digit number
            sum += (number % 10); // to get the and add the right most digit
            number = number/ 10; // dropping the last right number
        }

        sum += number; // getting the most left digit and add it to sum.




        return sum;
    }
}
