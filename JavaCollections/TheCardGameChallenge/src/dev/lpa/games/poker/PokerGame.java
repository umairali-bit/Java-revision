package dev.lpa.games.poker;

import dev.lpa.Card;

import java.util.*;

public class PokerGame {

    //standard deck
    private final List<Card> deck = Card.getStandardDeck();

    private int playerCount;

    private int cardsInHand;

    private List<PokerHand> pokerHands;

    private List<Card> remainingCards;

    public PokerGame(int playerCount, int cardsInHand) {
        this.playerCount = playerCount;
        this.cardsInHand = cardsInHand;
        pokerHands = new ArrayList<>(cardsInHand);// setting the capacity to the value contained in cardsInHand
    }

    public void startPlay() {

        Collections.shuffle(deck);
        Card.printDeck(deck);

        //cutting the deck in half
        //putting the top part under the lower part

        //noone can cut the deck exactly in half so
        int randomMiddle = new Random().nextInt(15,35);
        // for cutting the deck exactly in half -> Collections.rotate(deck, 26);
        Collections.rotate(deck, randomMiddle);
        Card.printDeck(deck);

        deal();
        System.out.println("-".repeat(30));
        //print each poker hand
        pokerHands.forEach(System.out::println);

        int cardsDealt = playerCount * cardsInHand;
        int cardsRemaining = deck.size() - cardsDealt;

        remainingCards = new ArrayList<>(Collections.nCopies(cardsRemaining, null));
        remainingCards.replaceAll(c -> deck.get(cardsDealt + remainingCards.indexOf(c)));
        Card.printDeck(remainingCards, "Remaining Cards", 2);


    }

    private void deal() {

        //two-dimensional array for each player. Each player's array will contain the set of cards in hand,
        Card[][] hands = new Card[playerCount][cardsInHand];
        // to cycle through the deck, one at a time, one card at a time, for each card in hand.

        for (int deckIndex = 0,i = 0; i< cardsInHand; i++){

            //then loop through each player, assigning each card in each player's hand a unique card off the deck, using the deckIndex variable
            for (int j = 0; j< playerCount; j++) {
                hands[j][i] = deck.get(deckIndex++);
            }
        }
        //Creating poker hand
        //creating a variable for the player number and looping through the two-dimensional array
        //instantiating a new poker hand for each player, passing it each player's array of cards using Arrays.asList in the constructor

        int playerNo = 1;
        for (Card[] hand : hands) {
            pokerHands.add(new PokerHand(playerNo++, Arrays.asList(hand)));
        }
    }







}
