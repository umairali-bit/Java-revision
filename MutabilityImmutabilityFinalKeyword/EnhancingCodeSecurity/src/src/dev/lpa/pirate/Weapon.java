package src.dev.lpa.pirate;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

/*
Use an enum for the Weapon options.
Weapon should have two fields.
Hit points that get deducted from a player hit by this weapon.
Level, which is the minimum level needed to be able to use the weapon.
Use an enum constructor to set this up.

 */

public enum Weapon {

    KNIFE(0,10),
    AXE (0, 30),
    MACHETE(1, 40),
    PISTOL(1, 50);

    private final int minLevel;
    private final int hitPoints;


    Weapon(int minLevel, int hitPoints) {
        this.minLevel = minLevel;
        this.hitPoints = hitPoints;
    }

    public int getMinLevel() {
        return minLevel;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public static Weapon getWeaponByChar (char firstInitial) {

        for (Weapon w : values()) {
            if (w.name().charAt(0) == firstInitial) {
                return w;
            }
        }
        return values()[0];

    }

    // returns a list of weapons
    public static List<Weapon> getWeaponsByLevel (int levelOfPlay) {

        List<Weapon> weapons = new ArrayList<>(EnumSet.allOf(Weapon.class));
        weapons.removeIf(w -> (w.minLevel > levelOfPlay));
        return weapons;

    }


}
