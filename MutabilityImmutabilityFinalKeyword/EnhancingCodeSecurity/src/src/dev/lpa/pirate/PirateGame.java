package src.dev.lpa.pirate;

import dev.lpa.game.Game;
import dev.lpa.game.GameAction;

import java.util.ArrayList;
import java.util.LinkedHashMap;
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
        System.out.println("Finished Loading Data.");
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

        Pirate pirate = getPlayer(playerIndex);
        System.out.println(pirate);
        List<Weapon> weapons = Weapon.getWeaponsByLevel(pirate.value("level"));

        Map<Character, GameAction> map = new LinkedHashMap<>();

        for (Weapon weapon : weapons) {
            char init = weapon.name().charAt(0);
            map.put(init, new GameAction(init, "Use " + weapon, this::useWeapon));//or i->useWeapon(i)
        }

        map.putAll(getStandardActions());


        return map;
    }

    private static void loadData() {

        //level 1 Towns
        levelMap.add(new ArrayList<>(List.of(
                "Bridgetown, Barbados",
                "Fitts Village, Barbados",
                "Holetown, Barbados"

        )));

        //level 2 Towns
        levelMap.add(new ArrayList<>(List.of(
                "Fort-de-France, Martinique",
                "FSainte-Anne, Martinique",
                "Le Vauclin, Martinique"

        )));
    }

    // to return towns from a specific level
    public static List<String> getTowns (int level) {

        if (level <= levelMap.size() -1) {
            return levelMap.get(level);
        } else {
            return null;
        }
    }

    private boolean useWeapon (int playerIndex) {
        return getPlayer(playerIndex).useWeapon();
    }

    @Override
    public boolean executeGameAction(int player, GameAction action) {
        getPlayer(player).setCurrentWeapon(Weapon.getWeaponByChar(action.key()));
        return super.executeGameAction(player, action);
    }
}
