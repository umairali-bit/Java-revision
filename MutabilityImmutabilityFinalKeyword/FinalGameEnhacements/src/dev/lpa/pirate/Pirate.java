package dev.lpa.pirate;

// It should have a Pirate class that implements the Player interface.

import java.util.*;

public final class Pirate extends Combatant {

    private final List<Town> townsVisited = new LinkedList<Town>();

    private List<Loot> loot;

    private List <Combatant> opponents;

    private List<Feature> features;

    public Pirate(String name) {
        super(name, Map.of("level", 0, "townIndex", 0));
        visitTown();
    }

    boolean useWeapon () {

        int count = opponents.size(); //getting pirates copy of opponnents, getting size
        if (count > 0) { // if its greater than zero, then there are still living opponents
            int opponentIndex = count - 1; // setting the default opponentIndex to the count - 1
            if (count > 1) {//if count> 1, using random number to randomly pick the opponent
                opponentIndex = new Random().nextInt();
            }
            Combatant combatant = opponents.get(opponentIndex); //getting the combatant from the opponents list using randomIndex
            if (super.useWeapon(combatant)) {//if this is true, that means combatant dies.
                opponents.remove(opponentIndex);// removing that opponent
            } else {
                    return combatant.useWeapon(this);// its the opponents turn
                }
            }
            return false;//if there arent any opponents, the game continues
        }

    boolean visitTown() {

        List<Town> levelTowns = PirateGame.getTowns(value("level"));
        if (levelTowns == null) return true;
        Town town = levelTowns.get(value("townIndex"));
        if (town != null) {
            townsVisited.add(town);
            loot = town.loot();
            opponents = town.opponents();
            features = town.features();
            return false;
        }
        return true;
    }


    // two helper methods
    boolean hasExperiences() {
        return (features != null && features.size() > 0);

    }

    boolean hasOpponents() {
        return (opponents != null && opponents.size() > 0);

    }
    public String information() {

        var current = ((LinkedList<Town>) townsVisited).getLast();
        String[] simpleNames = new String[townsVisited.size()];
        Arrays.setAll(simpleNames, i -> townsVisited.get(i).name());
        return "------> " + current +
                "\n" + super.information() +
                "\n\ttownsVisited=" + Arrays.toString(simpleNames);

    }

    boolean findLoot() {
        if (loot.size() > 0) {
            Loot item = loot.remove(0);
            System.out.println("Found " + item + "!");
            adjustValue("score", item.getWorth());
            System.out.println(name() + "'s score is now " + value("score"));
        }

        if (loot.size() == 0) {
            return visitTown();
        }
        return false;
    }


    boolean experienceFeature() {
        if (features.size() > 0) {

            Feature item = features.remove(0);
            System.out.println("Ran into " + item + "!");
            adjustHealth(item.getHealthPoints());
            System.out.println(name() + " 's health is now " + value("health"));

        }

        return (value("health") <= 0);
    }



    private boolean visitNextTown() {

        int townIndex = value("townIndex");
        List<Town> towns = PirateGame.getTowns(value("level"));
        if (towns == null) return true;
        if (townIndex >= (towns.size()-1)) {
            System.out.println("Leveling up! Bonus: 500 points!");
            adjustValue("score", 500);
            adjustValue("level", 1);
            setValue("townIndex", 0);
        } else {
            System.out.println("Sailing to the next town! Bonus: 50 points!");
            adjustValue("townIndex", 1);
            adjustValue("score", 50);
        }

        return visitTown();
    }
}