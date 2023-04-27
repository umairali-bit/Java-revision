public class operatorChallenge {
    public static void main(String[] args) {


        // step 1: create a double variable with a value of 20.00
        double firstVar = 20.00;

        // step 2 : create a second variable of type double with a value 80.00
        double secondVar = 80.00;

        // step 3 : add both numbers together, then multiply by 100.00
        double sumOfVar = (firstVar + secondVar) * 100.00;
        System.out.println(sumOfVar);

        // step 4 : use the remainder operator, to figure out what the remainder from the result of the operation in step three, and 40.00 will be
        double remainderVar = (sumOfVar % 40.00);
        System.out.println(remainderVar);

        // step 5 : create a boolean var that assings the value true, if the remainder in step 4 is 0.00, or false if its not
        boolean isNoRemainder = (remainderVar == 0.0)? true : false;
        // output the boolean variable just to see what the result is
        System.out.println(isNoRemainder );

        // write an if-then statement that displays a message, 'got some remainder', if the boolean in step five is not true

        if(!isNoRemainder) {
            System.out.println("got some remainder");
        }








    }
}
