package dev.lpa.pirate;

import java.util.Collections;
import java.util.List;

public record Town(String name, String island, int level,
                   List<Loot> loot,
                   List<Feature> feature,
                   List<Combatant> opponents) {

    //A generic method that returns a List<T> randomizes the elements in the list and returns a sublist of those elements
    private <T> List<T> randomReduced(List<T> list, int size) {

        Collections.shuffle(list);
        return list.subList(0,size);

    }


}
