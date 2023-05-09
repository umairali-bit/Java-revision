public class MathodOverLoading {

    public static void main(String[] args) {

/*        int newScore = calculateScore("TIM", 500);
        System.out.println("New Score is " + newScore);

        // call to calculateScore(int score)
        calculateScore(75);

        // call to calculateScore();
        calculateScore();*/

        System.out.println("New Score is " +calculateScore("Tim", 500));
        System.out.println("New Score is " +calculateScore(10));

    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 100;
    }

    // method overloading
    public static int calculateScore(int score) {
        // System.out.println("Unamed Player scored " + score + " points");
        //return score * 100;

        return calculateScore("Anonymous", score);

    }

    public static int calculateScore() {
        System.out.println("No player name, no player score");
        return 0;
    }





}
