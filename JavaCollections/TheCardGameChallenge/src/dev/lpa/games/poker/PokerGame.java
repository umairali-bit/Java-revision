package dev.lpa.games.poker;

import dev.lpa.Card;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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

    public void setPlay() {

        Collections.shuffle(deck);
        Card.printDeck(deck);
    }





}
