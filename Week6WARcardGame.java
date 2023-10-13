
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Week6WARcardGame {

    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle();

        Player player1 = new Player("Player 1");
        Player player2 = new Player("Player 2");

        while (!deck.isEmpty()) {
            player1.draw(deck);
            player2.draw(deck);
        }

        while (!player1.isEmpty() && !player2.isEmpty()) {
            Card card1 = player1.flip();
            Card card2 = player2.flip();

            System.out.println(player1.getName() + " flips:");
            card1.describe();
            System.out.println(player2.getName() + " flips:");
            card2.describe();

            int result = card1.compare(card2);
            if (result > 0) {
                player1.incrementScore();
                System.out.println(player1.getName() + " receives a point!");
            } else if (result < 0) {
                player2.incrementScore();
                System.out.println(player2.getName() + " receives a point!");
            } else {
                System.out.println("It's a tie! No point awarded.");
            }
        }

        int player1Score = player1.getScore();
        int player2Score = player2.getScore();

        System.out.println("\nFinal Scores:");
        System.out.println(player1.getName() + ": " + player1Score);
        System.out.println(player2.getName() + ": " + player2Score);

        if (player1Score > player2Score) {
            System.out.println(player1.getName() + " wins!");
        } else if (player1Score < player2Score) {
            System.out.println(player2.getName() + " wins!");
        } else {
            System.out.println("It's a draw!");
        }
    }
}

class Card {
    private int value;
    private String name;

    public Card(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public int compare(Card other) {
        return Integer.compare(this.value, other.value);
    }

    public void describe() {
        System.out.println(name);
    }
}

class Deck {
    private List<Card> cards = new ArrayList<>();

    public Deck() {
        // Populate the deck with standard 52 cards
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] names = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};

        for (String suit : suits) {
            for (int i = 0; i < 13; i++) {
                String cardName = names[i] + " of " + suit;
                Card card = new Card(i + 2, cardName);
                cards.add(card);
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public Card draw() {
        if (!cards.isEmpty()) {
            Card drawnCard = cards.remove(0);
            return drawnCard;
        }
        return null;
    }

    public boolean isEmpty() {
        return cards.isEmpty();
    }
}

class Player {
    private List<Card> hand = new ArrayList<>();
    private int score = 0;
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void describe() {
        System.out.println(name + "'s hand:");
        for (Card card : hand) {
            card.describe();
        }
    }

    public Card flip() {
        if (!hand.isEmpty()) {
            return hand.remove(0);
        }
        return null;
    }

    public void draw(Deck deck) {
        Card drawnCard = deck.draw();
        if (drawnCard != null) {
            hand.add(drawnCard);
        }
    }

    public void incrementScore() {
        score++;
    }

    public int getScore() {
        return score;
    }

    public boolean isEmpty() {
        return hand.isEmpty();
    }
}