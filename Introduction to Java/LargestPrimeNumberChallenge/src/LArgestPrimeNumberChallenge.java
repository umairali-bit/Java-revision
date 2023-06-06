public class LArgestPrimeNumberChallenge {

    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));

    }

    public static int getLargestPrime(int number) {


        int largestPrime = 2;
        if(number <0 || number <= 1){
            return -1;
        } else{

            // checks if the number is divisible by the largest prime number and has no remainder
            while(number > largestPrime){
                if(number % largestPrime != 0){
                    largestPrime++;

                    // if theres no remainder the number get divided by the largestPrime in the loop
                } else{
                    number = number/largestPrime;
                }

            }

        }

        return number;

    }
}
