package Lesson_16.Game;

import java.util.ArrayList;

public class Player {
    private String name;
    private ArrayList<Card> hand;

    public Player(String name) {
        this.name = name;
        this.hand = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addCard(Card card) {
        hand.add(card);
    }

    public ArrayList<Card> getHand() {
        return hand;
    }

    public int calculatePoints() {
        int points = 0;
        for (Card card : hand) {
            points += card.getRank().ordinal() + 2;
        }
        return points;
    }
}
