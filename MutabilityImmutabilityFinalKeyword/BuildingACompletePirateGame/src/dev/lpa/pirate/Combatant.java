package dev.lpa.pirate;

// It should have a Pirate class that implements the Player interface.

import dev.lpa.game.Player;

import java.util.*;

public sealed abstract class Combatant implements Player permits Islander, Pirate, Soldier {

    private final String name;

    // to declare fields for score,health, currentTownIndex using a map
    private final Map<String, Integer> gameData;

    private Weapon currentWeapon;

    public Combatant(String name) {
        this.name = name;
    }

    public Combatant(String name, Map<String, Integer> gameData) {
        this.name = name;
        if (gameData != null) {
            this.gameData.putAll(gameData);
        }
    }

    //using instance initializer to initialize gameData

    {
        gameData = new HashMap<>(Map.of(
                "score", 0,
                "health", 100



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

    protected void setValue (String name, int value) {
        gameData.put(name, value);
    }

    //This method will adjust a value in the data map, will be private,again encapsulated, it takes a field name
    // and an adjustment value, using the Map's compute method
    protected void adjustValue(String name, int adj) {
        gameData.compute(name, (k,v) -> v += adj);

    }

    // health should not go zero or above hundred
    protected void adjustHealth(int adj) {

        int health = value("health");
        health += adj;
        health = (health < 0) ? 0 : (health > 100) ? 100 : health;
        setValue("health", health);
    }

    boolean useWeapon (Combatant opponent) {

        System.out.println(name + "used the " + currentWeapon);

        if (new Random().nextBoolean()) {
            System.out.println(" and HIT *** " + opponent.name() + "! ***");
            opponent.adjustHealth(-currentWeapon.getHitPoints());
            System.out.printf("%s's health=%d, %s's health=%d%n",
                    name, value("health"),
                    opponent.name(), opponent.value("health"));
            adjustValue("score", 50);
        } else {
            System.out.println(" and missed!");
        }
        return (opponent.value("health") <= 0);

    }
    @Override
    public String name() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    public String information() {
        return name + " " + gameData;
    }

}