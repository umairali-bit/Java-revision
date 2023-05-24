public class Main {

    public static void main(String[] args) {


        // we dont need to initialize variables here like this after initializing them in methods as arguments

/*        boolean gameOver = true;
        int score = 5000;
        int score2 = 4000;
        int score3 = 800;
        int score4 = 6000;
        int levelCompleted = 5;
        int bonus = 100;

        int finalScore = score;

        calculateScore(true, 5000, 4000, 800, 6000, 5, 100); // called method calculateScore
        calculateScore2(true, 10000, 8, 200);*/

        // the right way to do
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        calculateScore(gameOver, score, levelCompleted, bonus);


        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        calculateScore2(gameOver, score, levelCompleted, bonus);

        //using the value returned from calculateScore3()
        int highScore = calculateScore3(gameOver, score, levelCompleted, bonus);
        System.out.println("The return statement is returning " + highScore);



    }


    // A method declares executable code that can be invoked, passing a fixed number of values as arguments
    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {//passing variable information into calculateScore();

        int finalScore = score;


        // same thing as if(gameOver == true)
        if (gameOver) {

            // using compount assignment operator +=
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
        }


    }

    public static void calculateScore2(boolean gameOver, int score, int levelCompleted, int bonus) {
        // change the values of the variables


        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            System.out.println("The next final score is " + finalScore);
        }


    }

    // if we want to return something from the method to the invoker to the method
     public static int calculateScore3(boolean gameOver, int score, int levelCompleted, int bonus) {// used int as datatype because we are returning int

         int finalScore = score;


         // same thing as if(gameOver == true)
         if (gameOver) {

             // using compount assignment operator +=
             finalScore += (levelCompleted * bonus);
             finalScore += 1000;

         }

        return finalScore;

     }


}
