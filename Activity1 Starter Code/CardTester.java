/**
 * This is a class that tests the Card class.
 */
public class CardTester {

 /**
  * The main method in this class checks the Card operations for consistency.
  * @param args is not used.
  */
 public static void main(String[] args) {
  /* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
   Card lancer = new Card("Jack", "Spades", 1);
   //System.out.println(lancer.pointValue());
   Card lancerTwo = new Card("Jack", "Spades", 1);
   System.out.println(lancerTwo.matches(lancer));
 }
}
