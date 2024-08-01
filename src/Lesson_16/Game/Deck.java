package Lesson_16.Game;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> cards;

    public Deck() {
        cards = new ArrayList<>();
        for (Card.Suit suit : Card.Suit.values()) {
            for (Card.Rank rank : Card.Rank.values()) {
                cards.add(new Card(suit, rank));
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public Card dealCard() { //kartları paylamaq
        if (!cards.isEmpty()) {
            return cards.remove(cards.size() - 1);
        }
        return null;
    }

    public int remainingCards() {
        return cards.size();
    }
}