/*
Use endless loop which:
1. Prompts the user to enter a number, or any character to quit.
2. Validates if the user-entered data is a number, you can choose either an integer, or double validation method.
3. If the user-entered data is not a number, quit the loop.
4. keep track of the minimum number entered.
5. keep track of maximum number entered.
6. If the user has previously entered a set of number (or even just one), display the minimum, and maximum number.
    which the user has entered.



 */

import java.util.Scanner;

public class MinabdMax {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double max = 0;
        double min = 0;
        int loopCount = 0;

        while (true) {

        System.out.println("Enter a number, or any character to exit:");
        String newEntry = sc.nextLine();
        try{
            double validNum = Double.parseDouble(newEntry);
            if (loopCount == 0 || validNum < min) {
                min = validNum;
            }
            if(loopCount == 0 || validNum > max) {
                max = validNum;
            }
            loopCount++;
        } catch(NumberFormatException nfe) {
            break;

        }

        }
        if(loopCount > 0 ) {
            System.out.println("min = " + min + " , max = " + max);
        } else {
            System.out.println("No valid data entered");
        }


    }





}
