public class DIagonalStarChallenge {
    public static void main(String[] args) {
        //printSquareStar1(4);
        diagonalPrintStar(5);

    }

    public static void printSquareStar1(int number){

        if(number < 5) {
            //return "Invalid Value";
        }

        for(int row =1; row <= number; row++){
            for (int col = 1; col<=number; col++){
                System.out.print("* ");
            }
            System.out.println();

        }





    }

    public static void diagonalPrintStar(int number) {

        if (number < 5){
            System.out.println("Invalid Value");
        } else {

            for(int i = 0; i< number; i++){
                for (int j = 0; j< number; j++){
                    if(i == 0 || j== 0 || i== (number-1)|| j==(number-1) || i ==j || j==number - (i +1)){
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }

            }System.out.println();
            }
        }
    }
}
