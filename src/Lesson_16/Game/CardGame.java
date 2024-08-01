package Lesson_16.Game;

import java.util.ArrayList;

public class CardGame {
    private Deck deck;
    private ArrayList<Player> players;

    public CardGame() {
        deck = new Deck();
        deck.shuffle();
        players = new ArrayList<>();
    }

    public static void main(String[] args) {
        CardGame game = new CardGame();
        game.addPlayer("Alice");
        game.addPlayer("Bob");
        game.dealCards(7);
        game.showHands();
        game.determineWinner();
    }

    public void addPlayer(String name) {
        players.add(new Player(name));
    }

    public void dealCards(int numberOfCards) {
        for (Player player : players) {
            for (int i = 0; i < numberOfCards; i++) {
                player.addCard(deck.dealCard());
            }
        }
    }

    public void showHands() {
        for (Player player : players) {
            System.out.println(player.getName() + "'s hand: " + player.getHand());
        }
    }

    public void determineWinner() {
        Player winner = null;
        int highestPoints = 0;

        for (Player player : players) {
            int playerPoints = player.calculatePoints();
            if (playerPoints > highestPoints) {
                highestPoints = playerPoints;
                winner = player;
            }
        }

        if (winner != null) {
            System.out.println("The winner is " + winner.getName() + " with " + highestPoints + " points!");
        } else {
            System.out.println("No winner, it's a draw!");
        }
    }
}

