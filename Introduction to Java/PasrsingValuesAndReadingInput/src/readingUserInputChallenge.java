/*
Challenge is enter five integres and make sure those are integers and return the sum of it
 */



import java.util.Scanner;

public class readingUserInputChallenge {

    public static void main(String[] args) {
        readNumber();

    }

    public static void readNumber() {



        int sum = 0;

        Scanner myInput = new Scanner(System.in);



                for (int i = 1; i <= 5;) {
                    System.out.println("Enter number # " + i);
                    String integers = myInput.nextLine();
                    try {
                        int number = Integer.parseInt(integers);
                        i++;
                        sum += number;
                    } catch (Exception e) {
                        System.out.println("Enter an Integer please ");

                    }






                }

            System.out.println("Sum = " + sum);






    }

    public static int checkInteger(int numbers, double integer){

       if(numbers%1 == 0) {
           return 1;
       } else {
           return -1;
       }

    }


}
