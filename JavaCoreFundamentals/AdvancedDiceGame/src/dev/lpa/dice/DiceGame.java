package dev.lpa.dice;

import dev.lpa.game.Game;
import dev.lpa.game.GameAction;

import java.util.LinkedHashMap;
import java.util.Map;

public class DiceGame extends Game<DicePlayer> {

    public DiceGame(String gameName) {
        super(gameName);
    }

    @Override
    public DicePlayer createNewPlayer(String name) {
        return new DicePlayer(name);
    }

    @Override
    public Map<Character, GameAction> getGameActions(int playerIndex) {

        Map<Character, GameAction> map = new LinkedHashMap<>();
        map.putAll(getStandardActions());
        return map;

    }
}
