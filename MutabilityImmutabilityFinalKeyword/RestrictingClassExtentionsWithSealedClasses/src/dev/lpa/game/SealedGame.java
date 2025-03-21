package dev.lpa.game;

/*
The Game class should be abstract and generic, and the type parameter should be a type of Player.
This class should have three fields, a gameName, a list of players, and a map of game actions.
Your Game class should have two abstract methods you want any custom game to implement.
The method createNewPlayer will return a new instance of the type used for a player.
The method getGameActions will return a map that associates a character a user would enter with a prompt and an
action to be taken. For example, if a user selects Q, this should map to a GameAction record, that has "Quit Program"
as the prompt, and a lambda expression, calling the quit method on the game, with a method reference, this::quitGame.

This class should have concrete methods, some of which might be overridden by subclasses.
The addPlayer method takes a String for name, creates a player instance, adding it to the Game's player list, and
returns that index.The executeGameAction will call the Predicate's test method on the lambda expression in the action
field, returning the boolean result.The printPlayer and quitGame methods are the methods referenced in the GameAction
records.Include getter and helper methods as appropriate.Finally, create your own simple game, and player type, and
test some of the methods on the GameConsole.
 */


import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

//The Game class should be abstract and generic, and the type parameter should be a type of Player.
public sealed abstract class SealedGame<T extends Player> permits ShooterGame {



    //This class should have three fields, a gameName, a list of players, and a map of game actions.
    private final String gameName;
    private final List<T> players = new ArrayList<>();
    private Map<Character, GameAction> standardActions = null;

    public SealedGame(String gameName) {
        this.gameName = gameName;
    }

    public String getGameName() {
        return gameName;
    }

    public List<T> getPlayers() {
        return players;
    }

    public Map<Character, GameAction> getStandardActions() {
        if (standardActions == null) {
            standardActions = new LinkedHashMap<>(Map.of(
                    'I', new GameAction('I', "Print Player Info", i-> this.printPlayer(i)),
                    'Q', new GameAction('Q',"Quit Game", this::quitGame)
            ));
        }
        return standardActions;
    }

    //Your Game class should have two abstract methods you want any custom game to implement.

    public abstract T createNewPlayer(String name);
    public abstract Map <Character, GameAction> getGameActions (int playerIndex);



//The addPlayer method takes a String for name, creates a player instance, adding it to the Game's player list, and
//returns that index
    final int addPlayer(String name) {

        T player = createNewPlayer(name);
        if (player != null) {
            players.add(player);
            return players.size() -1;
        }
        return -1;
    }

    protected final T getPlayer(int playerIndex) {
        return players.get(playerIndex);
    }


   // The executeGameAction will call the Predicate's test method on the lambda expression in the action
  //  field, returning the boolean result.The printPlayer and quitGame methods are the methods referenced in the GameAction
  //  records
    public boolean executeGameAction(int player, GameAction action) {
        return action.action().test(player);

    }

    public boolean printPlayer(int playerIndex) {
        Player player = players.get(playerIndex);
        System.out.println(player);
        return false;
    }

    public boolean quitGame(int playerIndex) {

        Player player = players.get(playerIndex);
        System.out.println("Sorry to see you go, " + player.name());
        return true;
    }



}
