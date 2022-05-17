public class CardTester
{
  // This is the main method of the program that tests all methods in the Card
  // class
  public static void main(String[] args)
  {
    // creates three new Card objects
    Card one = new Card("9", "Diamonds", 9);
    Card two = new Card("7", "Hearts", 7);
    Card three = new Card("3", "Spades", 3);

    // displays all information about each Card objects
    System.out.println("Suit of card one: " + one.suit());
    System.out.println("Rank of card one: " + one.rank());
    System.out.println("Point value of card one: " + one.pointValue());
    System.out.println("Card one: " + one.toString());
    System.out.println();
    
    System.out.println("Suit of card two: " + two.suit());
    System.out.println("Rank of card two: " + two.rank());
    System.out.println("Point value of card two: " + two.pointValue());
    System.out.println("Card two: " + two.toString());
    System.out.println();
    
    System.out.println("Suit of card three: " + three.suit());
    System.out.println("Rank of card three: " + three.rank());
    System.out.println("Point value of card three: " + three.pointValue());
    System.out.println("Card three: " + three.toString());
    System.out.println();
    
    System.out.println("Does card one matches card two? " + one.matches(two));
    System.out.println("Does card one matches card three? " + one.matches(three));
    System.out.println("Does card two matches card three? " + two.matches(three));
  }
}
