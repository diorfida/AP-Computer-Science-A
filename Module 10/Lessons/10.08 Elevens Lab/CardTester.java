/**
 * This is a class that tests the Card class.
 *
 *  Domenic Iorfida
 *  3/30/21
 */

public class CardTester
{
   /**
    * The main method in this class checks the Card operations for consistency.
    * @param args is not used.
    */
   public static void main(String[] args) {

      /* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */

      // Establish new cards
      Card aceHearts = new Card("ace", "hearts", 1);

      // Test card 1 and methods
      System.out.println("**** Tests Card 1: ace of hearts ****");
      System.out.println("  rank: " + aceHearts.rank());
      System.out.println("  suit: " + aceHearts.suit());
      System.out.println("  pointValue: " + aceHearts.pointValue());
      System.out.println("  toString: " + aceHearts.toString());
      System.out.println();

      // Test card 2
      Card fiveClubs = new Card("five", "clubs", 5);
      System.out.println("**** Tests Card 2: five of clubs ****");
      System.out.println("  rank: " + fiveClubs.rank());
      System.out.println("  suit: " + fiveClubs.suit());
      System.out.println("  pointValue: " + fiveClubs.pointValue());
      System.out.println("  toString: " + fiveClubs.toString());
      System.out.println();

      // Test card 3
      Card kingDiamonds = new Card("king", "diamonds", 10);
      System.out.println("**** Tests Card 3: king of diamonds ****");
      System.out.println("  rank: " + kingDiamonds.rank());
      System.out.println("  suit: " + kingDiamonds.suit());
      System.out.println("  pointValue: " + kingDiamonds.pointValue());
      System.out.println("  toString: " + kingDiamonds.toString());
      System.out.println();

      // Test matches() method
      System.out.println("**** matches Tests ****");
      boolean match = fiveClubs.matches(new Card("five", "clubs", 5));
      System.out.println("  matching: " + match);
      boolean noMatch = kingDiamonds.matches(aceHearts);
      System.out.println("  not matching: " + noMatch);
   }
}
