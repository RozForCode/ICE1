package card;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1.
 * @author srinivsi
 * @modifier [Your Name], [Your Student Number], [Date Modified]
 */
public class CardTrick {

    public static void main(String[] args) {
        Card[] magicHand = new Card[7];
        Random random = new Random();

        // Fill the magic hand with 7 random cards
        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue(random.nextInt(13) + 1); // Values between 1 and 13
            c.setSuit(Card.SUITS[random.nextInt(4)]); // Random suit
            magicHand[i] = c;
        }

        // Display the magic hand (for testing/debugging purposes)
      

        // Ask the user for a card
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pick a card:");
        System.out.print("Enter a value (1-13): ");
        int userValue = scanner.nextInt();
        System.out.print("Enter a suit (Hearts, Diamonds, Spades, Clubs): ");
        scanner.nextLine(); // Consume the newline
        String userSuit = scanner.nextLine();

        // Check if the user's card is in the magic hand
        boolean userCardFound = false;
        for (Card c : magicHand) {
            if (c.getValue() == userValue && c.getSuit().equalsIgnoreCase(userSuit)) {
                userCardFound = true;
                break;
            }
        }

        if (userCardFound) {
            System.out.println("Congratulations! Your card is in the magic hand!");
        } else {
            System.out.println("Sorry, your card is not in the magic hand.");
        }
        System.out.println("Magic Hand:");
        for (Card c : magicHand) {
            System.out.println(c.getValue() + " of " + c.getSuit());
        }

        

        scanner.close();
    }
}
