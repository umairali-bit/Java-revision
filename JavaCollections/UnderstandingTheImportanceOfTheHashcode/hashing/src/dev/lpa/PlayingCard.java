package dev.lpa;

public class PlayingCard {

    private String suit;

    private String face;

    private int internalHash;



    public PlayingCard(String suit, String face) {
        this.suit = suit;
        this.face = face;
        this.internalHash = (suit.equals("Hearts")? 11 : 12);


    }

    @Override
    public String toString() {
        return face + " of " + suit;
    }


    @Override
    public int hashCode() {
        return internalHash;
    }

    @Override
    public boolean equals(Object obj) {

        System.out.println("---> checking cards equality");
        return true;
    }
}
