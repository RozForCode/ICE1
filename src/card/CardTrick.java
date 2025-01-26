/**
 * A class that models playing card Objects. Cards have 
 * a value (note that Ace = 1, Jack -11, Queen =12, King = 13)
 * A suit (clubs, hearts, spades, diamonds).
 * There are 52 cards in a deck, no jokers.
 * This code is to be used in ICE1. When you create your own branch,
 * add your name as a modifier.
 * 
 * Modified by: Navrose Johal
 * Student ID: 991745899
 * Date: January 26, 2025
 * 
 * @author srinivsi
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
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Pick a card:");
        // System.out.print("Enter a value (1-13): ");
        // int userValue = scanner.nextInt();
        // System.out.print("Enter a suit (Hearts, Diamonds, Spades, Clubs): ");
        // scanner.nextLine(); // Consume the newline
        // String userSuit = scanner.nextLine();

        // // Check if the user's card is in the magic hand
        // boolean userCardFound = false;
        // for (Card c : magicHand) {
        //     if (c.getValue() == userValue && c.getSuit().equalsIgnoreCase(userSuit)) {
        //         userCardFound = true;
        //         break;
        //     }
        // }

        // if (userCardFound) {
        //     System.out.println("Congratulations! Your card is in the magic hand!");
        // } else {
        //     System.out.println("Sorry, your card is not in the magic hand.");
        // }
        
        // Hard-coded lucky card
        Card luckyCard = new Card();
        luckyCard.setValue(2);
        luckyCard.setSuit("Clubs");

        // Check if the lucky card is in the magic hand
        boolean luckyCardFound = false;
        for (Card c : magicHand) {
            if (c.getValue() == luckyCard.getValue() && c.getSuit().equals(luckyCard.getSuit())) {
                luckyCardFound = true;
                break;
            }
        }

        if (luckyCardFound) {
            System.out.println("Lucky card --(2 of Clubs)-- is in the magic hand! You win!");
        } else {
            System.out.println("Lucky card --(2 of Clubs)-- is not in the magic hand. Better luck next time!");
        }
        System.out.println("Magic Hand was:");
        for (Card c : magicHand) {
            System.out.println(c.getValue() + " of " + c.getSuit());
        }

    }
}





