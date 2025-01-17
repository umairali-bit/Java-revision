package dev.lpa.games.poker;

public enum Ranking {

    //worst hand
    NONE, ONE_PAIR, TWO_PAIR, THREE_OFA_KIND, FULL_HOUSE, FOUR_OF_A_KIND;


    @Override
    public String toString() {
        return this.name().replace('_',' '); //replacing _ with spaces
    }
}
