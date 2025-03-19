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

    public Weapon getCurrentWeapon() {
        return currentWeapon;
    }

    void setCurrentWeapon(Weapon currentWeapon) {
        this.currentWeapon = currentWeapon;
    }

    //setter and getter methods of my own
    //package private

    int value (String name) {
        return gameData.get(name);
    }

    //private setValue method. Only the Pirate class will be able to set this value. The return type is void and it
    //takes a String and an int. This method puts the value in the Map, using the name passed.

    private void setValue (String name, int value) {
        gameData.put(name, value);
    }

    //This method will adjust a value in the data map, will be private,again encapsulated, it takes a field name
    // and an adjustment value, using the Map's compute method
    private void adjustValue(String name, int adj) {
        gameData.compute(name, (k,v) -> v += adj);

    }

    // health should not go zero or above hundred
    private void adjustHealth(int adj) {

        int health = value("health");
        health += adj;
        health = (health < 0) ? 0 : (health > 100) ? 100 : health;
        setValue("health", health);
    }


    @Override
    public String name() {
        return name;
    }
}
