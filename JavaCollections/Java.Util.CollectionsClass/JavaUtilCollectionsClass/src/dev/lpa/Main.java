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
import java.util.concurrent.atomic.AtomicReference;

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



        Card kingOfClubs = Card.getFaceCard(Card.Suit.CLUB, 'K');
        List<Card> kingsOfClubs = Collections.nCopies(12, kingOfClubs);
        Card.printDeck(kingsOfClubs,"Kings of Clubs", 1);

        //addAll methods in Collections class
        //1st argument is the list to add elements to
        //2nd argument for the elements to be added, but unlike list's addAll method, this is a variable argument of elements to be added
        Collections.addAll(cards, cardArray);
        Collections.addAll(cards, cardArray);
        //card.addAll(cardArray); Invalid, you cannot pass an arrayList to a list. You can pass a collections to a list or use Array.asList
        Card.printDeck(cards, "Card Collection with Aces added", 2);


        //copy method on collections
        //1st argument is the destination of the copied elements.
        //2nd argument is the elements to be copied
        //you cannot use this method if the number of elements in the current list (kingsOfClubs) is less than the number of the source list (cards)
        Collections.copy(cards, kingsOfClubs);
        Card.printDeck(cards, "Card Collection with Kings copied", 2);

        cards = List.copyOf(kingsOfClubs);
        Card.printDeck(cards, "List Copy of Kings",1);













    }
}
