package dev.lpa.pirate;

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
}
