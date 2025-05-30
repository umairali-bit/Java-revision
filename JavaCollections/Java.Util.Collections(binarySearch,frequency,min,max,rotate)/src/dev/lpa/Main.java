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

import java.util.*;

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



        List<Card> deck1 = Card.getStandardDeck();
        Card.printDeck(deck1);

        Collections.shuffle(deck1);
        Card.printDeck(deck1, "Shuffled Deck", 4);

        Collections.reverse(deck1);
        Card.printDeck(deck1, "Reversed Deck", 4);

        var sortingAlgorithm = Comparator.comparing(Card::rank)
                .thenComparing(Card::suit);
        Collections.sort(deck, sortingAlgorithm);
        Card.printDeck(deck, "Standard Deck sorted by rank, suit", 13);
        Collections.reverse(deck);
        Card.printDeck(deck, "Sorted by rank, suit reversed", 13);


        //methods that compare full list to sublist
        //carving out a couple of smaller lists from the standard deck and passing them to a new ArrayList constructor
        List<Card> kings = new ArrayList<>(deck.subList(4, 8));
        Card.printDeck(kings, "Kings in deck", 1);

        List<Card> tens = new ArrayList<>(deck.subList(16, 20));
        Card.printDeck(tens, "tens in deck", 1);

        //returns an int if sublist is present in the list or -1 if it isnt

        int subListIndex = Collections.indexOfSubList(deck, tens);
        System.out.println("sublist index for tens = " + subListIndex);
        System.out.println("Contains = " + deck.containsAll(tens));

        //disjoint method return true if the two collections dont share elements, or false if they do
        boolean disjoint = Collections.disjoint(deck, tens);
        System.out.println("disjoint = " + disjoint);// return false

        boolean disjoint2 = Collections.disjoint(kings, tens);
        System.out.println("disjoint = " + disjoint2);// returns true


        //binary search on Lists
        //list should be sorted
        deck.sort(sortingAlgorithm);
        Card tensOfHearts = Card.getNumericCard(Card.Suit.HEART, 10);
        int foundIndex = Collections.binarySearch(deck, tensOfHearts, sortingAlgorithm);
        System.out.println("foundIndex = " + foundIndex);

        System.out.println(deck.get(foundIndex));

        //we can acquire the same result evewn without sorting our list by using list's indexOf()
        System.out.println("foundIndex = " + deck.indexOf(tensOfHearts));


        // collections replaceAll()
        // it requires to replace 1 or more elements in the list
        // this method returns a boolean value, true if one or more elements was replaced or false if not
        Card tensOfClubs = Card.getNumericCard(Card.Suit.CLUB, 10);
        Collections.replaceAll(deck, tensOfClubs, tensOfHearts);
        Card.printDeck(deck, "Tens row",13);


        Collections.replaceAll(deck, tensOfHearts, tensOfClubs);
        Card.printDeck(deck, "Tens row",13);

        if(Collections.replaceAll(deck, tensOfHearts, tensOfClubs)) {
            System.out.println("Tens of hearts replaced with tens of Clubs");
        } else {
            System.out.println("No tens of hearts found in the list");
        }

        //frequency() checks for duplicates
        System.out.println("Ten of Clubs Cards = " + Collections.frequency(deck, tensOfClubs));

        //min and max methods in collections
        System.out.println("Best card = " + Collections.max(deck, sortingAlgorithm));
        System.out.println("Worst card = " + Collections.min(deck, sortingAlgorithm));

        //rotate method
        //creating new comparator
        var sortBySuit = Comparator.comparing(Card::suit)
                .thenComparing(Card::rank);
        deck.sort(sortBySuit);
        Card.printDeck(deck, "Sorted by suit", 4);
        //creating a new list and passing the deck in array list constructor
        List<Card> copied = new ArrayList<>(deck.subList(0, 13));
        //places last two elements to first two elements
        Collections.rotate(copied, 2);
        System.out.println("UnRotated: " + deck.subList(0, 13));
        System.out.println("Rotated: " + 2 + ": " + copied);

         copied = new ArrayList<>(deck.subList(0, 13));
         //using a negative number will move the elements starts from the end of the list
        Collections.rotate(copied, -2);
        System.out.println("UnRotated: " + deck.subList(0, 13));
        System.out.println("Rotated: " + -2 + ": " + copied);

        //swap method
        //swapping only half of the elements
        copied = new ArrayList<>(deck.subList(0, 13));
        for (int i = 0; i < copied.size() / 2; i ++) {
            Collections.swap(copied, i, copied.size() -1 -i);
        }
        System.out.println("Manual reverse : " + copied);

        //also could be done by using reverse()
        copied = new ArrayList<>(deck.subList(0, 13));
        Collections.reverse(copied);
        System.out.println("Using reverse :" + copied);














    }
}
