public class Foorloop {

    public static void main(String[] args) {


        for (int counter = 1; counter <=5; counter++){
            System.out.println(counter);
            // prints 1 2 3 4 5
            // for (intit; expression; increment){
            // // block of statements }

        }
        // manually calculating 2, 3 ,4 ,5 percent interest rate
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 2.0));
        System.out.println("10,000 at 3% interest = " + calculateInterest(10000.0, 3.0));
        System.out.println("10,000 at 4% interest = " + calculateInterest(10000.0, 4.0));
        System.out.println("10,000 at 5% interest = " + calculateInterest(10000.0, 4.0));

        // use for statements to calculate 2, 3 ,4 ,5 percent

        for(double doubleinterestRate = 2.0; doubleinterestRate <=5; doubleinterestRate++){
            double interestAmount = calculateInterest(10000.0, doubleinterestRate);
            System.out.println("10,000 at " + doubleinterestRate + "% interest = " + interestAmount);

        }


        // mini challenge

        for (double interestrate = 7.5; interestrate <=10; interestrate += 0.25 ){
            double newInterestAmount = calculateInterest(100, interestrate);
            //if you want to stop the iteration at 8.5 in the loop
            if(newInterestAmount > 8.5){
                break;
            }
            System.out.println("100.00 at " + interestrate + "% interest = " + interestrate);
        }


    }

    public static double calculateInterest(double amount, double interestRate){



        return(amount *(interestRate / 100));
    }
}




