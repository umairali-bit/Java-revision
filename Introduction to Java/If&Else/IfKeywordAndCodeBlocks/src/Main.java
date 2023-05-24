public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 5000;
        int score2 = 4000;
        int score3 = 800;
        int score4 = 6000;
        int levelCompleted = 5;
        int bonus = 100;


        if (score3 < 5000) {
            System.out.println("Your score was less then 5000");
        } else {
            System.out.println("Got here");
        }

        if (score4 <= 5000) {//statement false, else block will be executed
            System.out.println("Your score was less then or equal to 5000");
        } else {
            System.out.println("Got here");
        }

        if (score2 < 5000 && score > 1000) {
            System.out.println("Your score was less then 5000 but greater than 1000");
        } else if (score < 1000){ //false statement
            System.out.println("Your score was less than 1000");
        } else {
            System.out.println("Got here"); //this got printed
        }

    }
}
