public class doWhile {

    public static void main(String[] args) {
        // forloop example

        for(int i = 1; i <= 5; i++){
            System.out.println(i);
        }

        System.out.println("********************");

        // same thing in while loop

        int j = 1;
        while (j <= 5) {
            System.out.println(j);
            j++;

        }


        System.out.println("********************");

        int k = 1;
        while(true) {
            if(k>5){
                break;
            }
            System.out.println(k);
            k++;

        }
        System.out.println("********************");





        int m = 1;
        boolean isReady = false;
        do{

            if(m>5){
                break;
            }
            System.out.println(k);
            m++;

        } while(isReady);




        System.out.println("********************");



        //continue statement
        int number = 0;
        while(number < 50) {
            number += 5;

            //when the number is equally divided by 25 this if statement will skip that number.
            if(number % 25 ==0){
                continue;
            }
            System.out.print(number + "-");
        }


    }



}
