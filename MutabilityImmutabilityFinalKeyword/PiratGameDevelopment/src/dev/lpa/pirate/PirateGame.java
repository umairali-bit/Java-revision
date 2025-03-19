package dev.lpa.pirate;

import dev.lpa.game.Game;
import dev.lpa.game.GameAction;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PirateGame extends Game<Pirate> {

    // A two-dimensional List; the first level (0) will represent the first level of play, the second level (1)
    //will represent the second level of play. This list contains a nested list of towns, the type argument is String.
    private static final List<List<String>> levelMap;


    //---------
    static {
        levelMap = new ArrayList<>();
        System.out.println("Loading Data....");
        loadData();

        if (levelMap.size() == 0) {
            throw new RuntimeException("Could not load data, try later");

        }
    }


    public PirateGame(String gameName) {
        super(gameName);
    }

    @Override
    public Pirate createNewPlayer(String name) {
        return new Pirate(name);
    }

    @Override
    public Map<Character, GameAction> getGameActions(int playerIndex) {
        return null;
    }
}
