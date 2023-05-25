public class EvenDigitSum {

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));
        System.out.println(getEvenDigitSum(0));
    }

    public static int getEvenDigitSum(int number) {
        int originalNumber = number;
        int lastDigit;
        int sumOfEvenDigits = 0;
        if (number >= 0) {
            while (number > 0) {
                lastDigit = number % 10;
                if (lastDigit % 2 == 0) {
                    sumOfEvenDigits += lastDigit;
                }
                number /= 10;
            }
            if (originalNumber >= 0) {
                System.out.println("The sum of even digits within a number " + originalNumber + " is equal to:");
            }
            return sumOfEvenDigits;
        }
        System.out.println("Invalid input:");
        return -1;
    }
}

/*
* Even Digit Sum
Write a method named getEvenDigitSum with one parameter of type int called number.

The method should return the sum of the even digits within the number.

If the number is negative, the method should return -1 to indicate an invalid value.



EXAMPLE INPUT/OUTPUT:

getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20

getEvenDigitSum(252); → should return 4 since 2 + 2 = 4

getEvenDigitSum(-22); → should return -1 since the number is negative
* */