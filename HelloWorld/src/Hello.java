public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, Tim");

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien");
            System.out.println("I am scared of Aliens");
        }

        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the high score!");
        }


        int secondTopScore = 60;
        if((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }


        if((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are ture");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is an error");
        }

        boolean isCar = false;
        if(isCar ==  true) {
            System.out.println("This is not supposed to happen");
        }

        boolean isCat = true;
        if (isCat) {
            System.out.println("Meow");
        }
        boolean isLove = false;
        if (!isLove) {
            System.out.println("Hugs&Kisses");
        }
    }

}



