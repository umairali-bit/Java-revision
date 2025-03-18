package dev.lpa.pirate;

// It should have a Pirate class that implements the Player interface.

import dev.lpa.game.Player;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Pirate implements Player {

    private final String name;

    // to declare fields for score,health, currentTownIndex using a map
    private final Map<String, Integer> gameData;

    private final List<String> townsVisited = new LinkedList<>();

    private Weapon currentWeapon;

    public Pirate(String name) {
        this.name = name;
    }

    //using instance initializer to initialize gameData

    {
        gameData = new HashMap<>(Map.of(
                "health", 100,
                "score", 0,
                "level", 0,
                "townIndex", 0
        ));
    }

    @Override
    public String name() {
        return name;
    }
}
