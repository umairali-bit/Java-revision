package dev.lpa;


/*

Car

private Suit suit;
private String face;
private int rank;
---------------------

Public Static methods
Card getNumericCard(Suit suit, int number)
Card getFaceCard(Suit suit, char abbrev)
List<Card> getStandardDeck()
void printDeck(List<Card> deck)
void printDeck(List<Card> deck, String description, int rows)
---------------------

public instance methods
String toString()
---------------------

Enumeration
Suit - {CLUB, DIAMOND, HEART, SPADE}
public instance methods
char getImage()

ASCII - CLUB = 9827, DIAMOND = 9830, HEART = 9829, SPADE = 9824


 */

import java.util.List;

public class Main {

    public static void main(String[] args) {


        List<Card> deck = Card.getStandardDeck();
        Card.printDeck(deck);

    }
}
