// checking if the number is even or not
// if the number is not even skipping that number
// printing out a single number





public class challenge {

    public static void main(String[] args) {
        System.out.println(isEvenNumber(6));
        whileLoop(4,20);
        singleEvenNumber(5);

    }

    public static boolean isEvenNumber(int number){


            if (number % 2 == 0) {
               return true;


            }
            return false;


        }




    public static int whileLoop(int number, int finishNumber){

        while(number <= finishNumber  ){
             number++;
             if(!isEvenNumber(number)){
                 continue;
             }
             System.out.println("Even number " +  number);
        }




        return 0;

    }

    // printing out a single number

    public static int singleEvenNumber (int number) {

        if(number % 2 == 0){
            System.out.println(number);
        } else {
            System.out.println("The number wasnt EVEN");
        }

        return 0;
    }



}
