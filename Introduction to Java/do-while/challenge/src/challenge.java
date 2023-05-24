// checking if the number is even or not
// if the number is not even skipping that number
// counting the total Even number found
//terminating for loop after 5 even numbers
// printing out a single number





public class challenge {

    public static void main(String[] args) {
        System.out.println(isEvenNumber(6));
        whileLoop(4,20);
        singleEvenNumber(5);

    }

    public static boolean isEvenNumber(int number){


        return number % 2 == 0;


    }




    public static void whileLoop(int number, int finishNumber){

        int evenCount =0;
        int oddCount=0;
        while(number <= finishNumber  ){
             number++;
             if(!isEvenNumber(number)){

                 // to count toal odd numbers
                 oddCount++;
                 continue;
             }
             System.out.println("Even number " +  number);

             // to count even numbers
             evenCount++;

             if(evenCount >= 5){
                 break;
             }



        }
        System.out.println("Total Odd numbers " + oddCount);
        System.out.println("Total Even numbers " + evenCount);


    }

    // printing out a single number

    public static void singleEvenNumber (int number) {

        if(number % 2 == 0){
            System.out.println(number);
        } else {
            System.out.println("The number wasnt EVEN");
        }

    }



}
