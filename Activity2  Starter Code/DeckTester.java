/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

 /**
  * The main method in this class checks the Deck operations for consistency.
  * @param args is not used.
  */
 public static void main(String[] args) {
   String[] suits = {"Clubs", "Diamonds", "Spades", "Hearts"};
   int[] ptVals = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3};
   String[] ranks = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King" };
  Deck delta = new Deck(ranks, suits, ptVals);
 }
}
