package dev.lpa.dice;

import dev.lpa.game.Player;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

public class DicePlayer implements Player {


    private final String name;

    private final List<Integer> currentDice = new ArrayList<>();

    private final Map<ScoredItem, Integer> scoreCard = new EnumMap<ScoredItem, Integer>(ScoredItem.class);


    public DicePlayer(String name) {
        this.name = name;
        for (ScoredItem item : ScoredItem.values()) {
            scoreCard.put(item, null);
        }
    }


}
