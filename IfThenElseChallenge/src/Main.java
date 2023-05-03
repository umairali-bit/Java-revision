public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 5000;
        int score2 = 4000;
        int score3 = 800;
        int score4 = 6000;
        int levelCompleted = 5;
        int bonus = 100;

        int finalScore = score;


        // same thing as if(gameOver == true)
        if (gameOver) {

            // using compount assignment operator +=
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score was " +finalScore);
        }


        // change the values of the variables

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        finalScore = score;

        if(gameOver) {
            finalScore += (levelCompleted * bonus);
            System.out.println("The next final score is " +finalScore);
        }



    }
}
