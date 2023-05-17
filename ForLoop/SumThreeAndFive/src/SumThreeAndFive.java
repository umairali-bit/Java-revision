//finding the first 5 numbers between 1 and 1000 divisible by 3 and 5 both
// and adding their sum


public class SumThreeAndFive {

    public static void main(String[] args) {

        int count = 0;
        int sumOfMatches = 0;
        for (int number = 1; count < 5 && number <= 1000; number++) {
            if (number % 3 == 0 && number % 5 == 0) {
                count++;
                sumOfMatches += number;
                System.out.println(number);

            }


        }
        System.out.println("Sum = " + sumOfMatches);


    }
}
