//        Write a method called inputThenPrintSumAndAverage that does not have any parameters.
//        The method should not return anything (void) and it needs to keep reading int numbers from the keyboard.
//        When the user enters something that is not an int then it needs to print a message in the format "SUM = XX AVG = YY".
//        XX represents the sum of all entered numbers of type int.
//        YY represents the calculated average of all numbers of type long.
//
//        EXAMPLE 1:
//        INPUT:
//        1
//        2
//        3
//        4
//        5
//        a
//        OUTPUT
//        SUM = 15 AVG = 3
//
//        EXAMPLE 2:
//        INPUT:
//        hello
//        OUTPUT:
//        SUM = 0 AVG = 0




import java.util.Scanner;

public class InputCalculator {

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();

    }

    public static void inputThenPrintSumAndAverage(){

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number");

        int sum = 0;
        int count = 0;
        double avg;


        // to find sum

        while (true) {
            boolean isInt = sc.hasNextInt(); //to check if its int or not
            if(isInt) {
                int number = sc.nextInt();//to store that int into number variable
                count++;
                sum += number;
            } else {
                break;
            }
        }


        // to find average
        if(count == 0) {
            System.out.println("SUM = 0 AVG = 0");

        } else {
            avg = Math.round((double)sum / (double) count); //casting to double
            System.out.print("SUM = " + sum + " AVG = " + (int) avg);
        }

        sc.close();

    }
}
