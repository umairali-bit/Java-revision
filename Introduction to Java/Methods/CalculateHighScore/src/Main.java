
/* Create two methods
* The first method should be named displayHighScorePosition
* This method should have two parameters, one for a players name and one for a players position in a highScore list
* This method should print a message like "TIM managed to get into position 2 on highScore list
* The second method should be named calculateHighScorePosition
* This method should have only one paramter, the players score
* This method should return a number between 1 and 4 and based on the score values shown
* call both methods and display the result for the following score:1500,1000,500,100,25 */

public class Main {


    public static void displayHighScorePosition(String playerName, int playersPosition){
        System.out.println(playerName +" managed to get into posisition "+playersPosition +
                            " on the high score list");

    }

    public static int calculateHighScorePosition(int playersScore) {

/*        if(playersScore >= 1000) {
            return 1;
        } else if (playersScore >= 500 && playersScore < 1000){
            return 2;

        } else if (playersScore >=100 && playersScore < 500){
            return 3;

        } else {
            return 4;
        }*/

        int position = 4;
        if (playersScore >= 1000) {
            position =1;
        } else if(playersScore >= 500) {
            position = 2;
        } else if (playersScore >= 100) {
            position = 3;
        }

        return position;

    }


    public static void main(String[] args) {

        int playersResult = calculateHighScorePosition(1500);
        displayHighScorePosition("TIM", playersResult);

        playersResult = calculateHighScorePosition(999);
        displayHighScorePosition("Bob", playersResult);

        playersResult = calculateHighScorePosition(500);
        displayHighScorePosition("Percy", playersResult);

        playersResult = calculateHighScorePosition(100);
        displayHighScorePosition("Gilbert", playersResult);

        playersResult = calculateHighScorePosition(25);
        displayHighScorePosition("James", playersResult);





    }
}
