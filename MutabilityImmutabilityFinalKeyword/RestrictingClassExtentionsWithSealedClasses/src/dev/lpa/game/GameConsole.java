package dev.lpa.game;

/*
The game console will be a container to execute some scanner code, to drive a text based game's play.
It'll collect a user name, creating a player from that.
It will start a while loop, displaying a menu of options for a user, then solicit a user's response.
It'll execute a game or player method, based on a user's selected action, and end the game if the action
indicates the game is over.

This GameConsole class is a container for a game, so it needs a type argument for a game field.
It should also have a static scanner field, which uses System.in to get keyboard input.
You should implement two methods on this class.
The addPlayer method will prompt a user for their name, read in the response from the scanner, and delegate to the
Game's addPlayer method.
The playGame method will display all available game options, soliciting user input in a while loop, and then should
call the action associated to the input.
The constructor should take a new instance of a Game.

 */

import java.util.Scanner;

public class GameConsole <T extends Game<? extends Player>> {

    private final T game;

    private static final Scanner scanner = new Scanner(System.in);

    public GameConsole(T game) {
        this.game = game;
    }


    public int addPlayer() {

        System.out.println("Enter your playing name: ");
        String name = scanner.nextLine();

        System.out.printf(" Welcome to %s, %s!%n".formatted(game.getGameName(), name));
        return game.addPlayer(name);

    }

    public void playGame(int playerIndex) {

        boolean done = false;
        while (!done) {
            var gameActions = game.getGameActions(playerIndex);
            System.out.println("Select from one of the following Actions: ");
            for (Character c : gameActions.keySet()) {
                String prompt = gameActions.get(c).prompt();
                System.out.println("\t" + prompt + " (" + c+ ")");
            }

            System.out.println("Enter Next Action: ");

            char nextMove = scanner.nextLine().toUpperCase().charAt(0);
            GameAction gameAction = gameActions.get(nextMove);

            if (gameAction != null) {
                System.out.println("-".repeat(50));
                done = game.executeGameAction(playerIndex, gameAction);
                if (!done) {
                    System.out.println("-".repeat(50));
                }
            }



        }
    }
}
