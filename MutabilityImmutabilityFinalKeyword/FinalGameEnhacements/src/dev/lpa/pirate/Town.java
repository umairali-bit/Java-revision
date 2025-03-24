package dev.lpa.pirate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;

public record Town(String name, String island, int level,
                   List<Loot> loot,
                   List<Feature> features,
                   List<Combatant> opponents) {

    public Town {
        loot = randomReduced(new ArrayList<>(EnumSet.allOf(Loot.class)), level + 2);//1st level will have 2 treasures
        features = randomReduced(new ArrayList<>(EnumSet.allOf(Feature.class)), level + 3);
        opponents = new ArrayList<>();

        if (level == 0) {
            opponents.add(new Islander("Joe", Weapon.KNIFE));
        } else {
            opponents.add(new Islander("Joe", Weapon.MACHETE));
            opponents.add(new Soldier("John", Weapon.PISTOL));
        }
    }

    public Town(String name, String island, int level) {
        this(name, island, level, null, null, null);
    }

    //A generic method that returns a List<T> randomizes the elements in the list and returns a sublist of those elements
    private <T> List<T> randomReduced(List<T> list, int size) {

        Collections.shuffle(list);
        return list.subList(0,size);

    }

    @Override
    public String toString() {
        return name + ", " + island;
    }


    public String information() {
        return "Town: " + this + "\n\tloot=" + loot +
                "\n\tfeatures=" + features +
                "\n\topponents=" + opponents;
    }

    //custom accessors with defensive copies
    public List<Loot> loot() {
        return (loot == null) ? null : new ArrayList<>(loot);
    }

    public List<Feature> features() {
        return (features == null) ? null : new ArrayList<>(features);
    }

    public List<Combatant> opponents() {
        return (opponents == null) ? null : new ArrayList<>(opponents);
    }
}
