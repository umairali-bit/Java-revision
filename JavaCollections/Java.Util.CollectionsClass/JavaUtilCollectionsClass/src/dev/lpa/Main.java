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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        List<Card> deck = Card.getStandardDeck();
        Card.printDeck(deck);

        //using fill method on Array
        Card[] cardArray = new Card[13];
        Card aceOfHearts = Card.getFaceCard(Card.Suit.HEART,'A');
        Arrays.fill(cardArray,aceOfHearts);
        Card.printDeck(Arrays.asList(cardArray),"Aces of Hearts", 1);


        //methods on collection class for populating a list

        List<Card> cards = new ArrayList<>(52);
        Collections.fill(cards, aceOfHearts);// .fill method on collection class cannot add elements. It would replace the
        // element with the element passed to the method
        System.out.println(cards);
        System.out.println("card.size() = " + cards.size());

        //to populate the list, collection class has nCopies()
        List<Card> acesOfHearts = Collections.nCopies(13,aceOfHearts);
        Card.printDeck(acesOfHearts, "Aces of Hearts", 1);


    }
}
