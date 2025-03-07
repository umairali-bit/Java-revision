package dev.lpa;

import java.util.ArrayList;
import java.util.List;

public record Card(Suit suit, String face, int rank) {

    public enum Suit {
        CLUB, DIAMOND, HEART, SPADE;

        public char getImage() {
            //an ordinal() method that returns the numerical position of each enumeration constant in its declaration
            return (new char[] {9827, 9830, 9829, 9824})[this.ordinal()];
        }
    }

    @Override
    public String toString() {

        int index = face.equals("10") ? 2 : 1; //if face = 10, return 2 digits or else return 1

        //retrieving either the first number or letter from the face of the card, or just 10 if its 10
        //returned a formatted string.
        String faceString = face.substring(0, index);
        return "%s%c(%d)".formatted( faceString, suit.getImage(),rank );



    }


    public static Card getNumericCard(Suit suit, int cardNumber) {

        if(cardNumber > 1 && cardNumber < 11) {
            return new Card (suit, String.valueOf(cardNumber), cardNumber -2); //cardNumber-2 because the cards are
            // the lowest card should have the rank 0 but number 2

        }
        System.out.println("Invalid Numeric Card selected");
        return null;
    }

    public static Card getFaceCard (Suit suit, char abbrev) {

        int charIndex = "JQKA".indexOf(abbrev);

        if(charIndex > -1 ) {
            return new Card(suit,"" + abbrev, charIndex + 9);
        }
        System.out.println("Invalid Face card selected");
        return null;
    }

    public static List<Card> getStandardDeck() {

        List<Card> deck = new ArrayList<>(52);
        for(Suit suit : Suit.values()) {
            for (int i = 2; i <= 10; i++) {
                deck.add(getNumericCard(suit,i));
            }
            for (char c : new char[]{'J','Q', 'K', 'A'}) {
                deck.add(getFaceCard(suit, c));
            }
        }
        return deck;
    }

    public  static void printDeck (List<Card> deck) {
        printDeck(deck,"Current Deck", 4);
    }

    public static void printDeck(List<Card> deck, String description, int rows) {

        System.out.println("-".repeat(50));

        if (description != null) {

            System.out.println(description);

        }

        int cardsInRow = deck.size()/rows;

        for ( int i = 0; i < rows; i++) {
            int startIndex = i * cardsInRow;
            int endIndex = startIndex + cardsInRow;
            deck.subList(startIndex, endIndex).forEach(c -> System.out.print(c + " "));
            System.out.println();
        }


    }




}













