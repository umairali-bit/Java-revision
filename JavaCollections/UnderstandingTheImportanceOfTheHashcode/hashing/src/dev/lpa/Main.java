package dev.lpa;

import java.util.*;

public class Main {

    public static void main(String[] args) {


        String aText = "Hello";
        String bText = "Hello";
        String cText = String.join("l","He","lo");
        String dText = "He".concat("llo");
        String eText = "hello";


        List<String> hellos = Arrays.asList(
                aText,bText,cText,dText,eText
        );

        hellos.forEach(s -> System.out.println(s + ": " + s.hashCode()));

        /*
        Hello: 69609650
        Hello: 69609650
        Hello: 69609650
        Hello: 69609650
        hello: 99162322
         */


        //hashSet
        //hashSet is a class that implements the Set interface and track duplicates by their hashCode
        Set<String> mySet = new HashSet<>(hellos);
        System.out.println("mySet = " + mySet);
        System.out.println("# of elements = " + mySet.size());

        /*
        mySet = [Hello, hello]
        # of elements = 2
         */

        for (String setValue : mySet) {
            System.out.print(setValue + ":");
            for (int i = 0; i < hellos.size(); i ++) {
                if (setValue == hellos.get(i)) {
                    System.out.print(i + ",");
                }
            }
            System.out.println(" ");
        }

        //creating 3 cards
        PlayingCard aceOfHearts = new PlayingCard("Hearts", "Ace");
        PlayingCard kingOfClubs = new PlayingCard("Clubs", "King");
        PlayingCard queenOfSpades = new PlayingCard("Spades", "Queen");

        //creating a list of cards
        List <PlayingCard> cards = Arrays.asList(
                aceOfHearts, kingOfClubs, queenOfSpades
        );
        //printing the hashCode
        cards.forEach( s -> System.out.println(s + ": " + s.hashCode()));

        /*
        Ace of Hearts: 258952499
        King of Clubs: 1706377736
        Queen of Spades: 468121027
         */

        //creating a set of cards adding the cards 1 at a time
        Set<PlayingCard> deck = new HashSet<>();

        //loop through the cards list and add these cards 1 at a time

        for (PlayingCard c : cards) {
            if (!deck.add(c)) {
                System.out.println("Found a duplicate for " + c);
            }
        }
        System.out.println(deck);

    }
}
