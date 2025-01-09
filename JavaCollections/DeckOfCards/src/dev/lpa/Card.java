package dev.lpa;

public record Card(Suit suit, String face, int rank) {

    public enum Suit {
        CLUB, DIAMOND, HEART, SPADE;

        public char getImage() {
            //an ordinal() method that returns the numerical position of each enumeration constant in its declaration
            return (new char[] {9827, 9830, 9829, 9824})[this.ordinal()];
        }
    }
}
