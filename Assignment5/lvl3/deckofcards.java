package Assignment_5.lvl3;
import java.util.Scanner;

public class deckofcards {

    // Suits and Ranks
    static String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
    static String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", 
                             "Jack", "Queen", "King", "Ace"};

    // Method to initialize the deck
    public static String[] initializeDeck() {
        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];

        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    // Method to shuffle the deck
    public static void shuffleDeck(String[] deck) {
        int n = deck.length;
        for (int i = 0; i < n; i++) {
            int randomCardNumber = i + (int)(Math.random() * (n - i));
            // Swap
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
    }

    // Method to distribute cards
    public static String[][] distributeCards(String[] deck, int numOfCards, int numOfPlayers) {
        if (numOfCards % numOfPlayers != 0) {
            System.out.println("Cards cannot be evenly distributed among players.");
            return null;
        }

        int cardsPerPlayer = numOfCards / numOfPlayers;
        String[][] players = new String[numOfPlayers][cardsPerPlayer];

        int index = 0;
        for (int i = 0; i < numOfPlayers; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                players[i][j] = deck[index++];
            }
        }
        return players;
    }

    // Method to print players and their cards
    public static void printPlayers(String[][] players) {
        if (players == null) return;

        for (int i = 0; i < players.length; i++) {
            System.out.println("Player " + (i + 1) + ":");
            for (String card : players[i]) {
                System.out.println("   " + card);
            }
            System.out.println();
        }
    }

    // Main Method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Initialize deck
        String[] deck = initializeDeck();

        // Shuffle deck
        shuffleDeck(deck);

        // Take input from user
        System.out.print("Enter number of cards to distribute (<= 52): ");
        int n = sc.nextInt();

        System.out.print("Enter number of players: ");
        int x = sc.nextInt();

        // Distribute cards
        String[][] players = distributeCards(deck, n, x);

        // Print players and their cards
        printPlayers(players);
    }
}

