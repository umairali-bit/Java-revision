package dev.lpa.games.poker;

import dev.lpa.Card;

import java.util.ArrayList;
import java.util.List;

public class PokerHand {

    private List<Card> hand;
    private List<Card> keepers;
    private List<Card> discards;
    private Ranking score = Ranking.NONE; //first ranking is none
    private int playerNo;

    public PokerHand(int playerNo, List<Card> hand) {
        hand.sort(Card.sortRandReversed());
        this.hand = hand;
        this.playerNo = playerNo;
        keepers = new ArrayList<>(hand.size());
        discards = new ArrayList<>(hand.size());
    }

    @Override
    public String toString() {
        return "%d. %-16s Rank:%d %-40s %s".formatted(
                playerNo, score, score.ordinal(), hand,
                (discards.size() > 0) ? "Discards:" + discards : "");

    }

    private void setRank(int faceCount) {
        switch (faceCount) {
            case 4 -> score = Ranking.FOUR_OF_A_KIND;
            case 3 -> {
                if (score == Ranking.NONE) score = Ranking.THREE_OF_A_KIND;
                else score = Ranking.FULL_HOUSE;
            }
            case 2 -> {
                if (score == Ranking.NONE) score = Ranking.ONE_PAIR;
                else if (score == Ranking.THREE_OF_A_KIND) score = Ranking.FULL_HOUSE;
                else score = Ranking.TWO_PAIR;
            }
        }
    }


}
