package dev.lpa.pirate;

public enum Loot {

    GOLD_COIN(10),
    GOLD_RING(125),
    PEARL_NECKLACE(25),
    GOLD_BAR(500);

    private final int worth;


    Loot(int worth) {
        this.worth = worth;
    }

    public int getWorth() {
        return worth;
    }
}
