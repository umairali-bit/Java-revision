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

        calculateScore(true, 5000, 4000, 800, 6000, 5, 100 ); // called method calculateScore





        // change the values of the variables

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            System.out.println("The next final score is " + finalScore);
        }


    }


    // A method declares executable code that can be invoked, passing a fixed number of values as arguments
    public static void calculateScore (boolean gameOver, int score, int score2,
                                       int score3, int score4,int levelCompleted, int bonus) {//passing variable information into calculateScore();

        int finalScore = score;


        // same thing as if(gameOver == true)
        if (gameOver) {

            // using compount assignment operator +=
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

    }


}
