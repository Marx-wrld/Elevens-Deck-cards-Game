public class Card
{
  // fields
  private String suit; // suit of the card
  private String rank; // rank of the card
  private int pointValue; // point value of the card

  // Constructor of the class that takes two string values of the card's rank
  // and suit, then one int value containing the card's point value
  public Card(String cardRank, String cardSuit, int cardPointValue)
  {
    rank = cardRank;
    suit = cardSuit;
    pointValue = cardPointValue;
  }

  // Get and return the card's suit
  public String suit()
  {
    return suit;
  }

  // Get and return the card's rank
  public String rank()
  {
    return rank;
  }

  // Get and return the card's point value
  public int pointValue()
  {
    return pointValue;
  }

  // This method is used to compare two card values to test for equality. In
  // order for them to be equal, the two card's rank, suit and point value must
  // all be equal. Otherwise return false.
  public boolean matches(Card otherCard)
  {
    if (rank.equals(otherCard.rank) && suit.equals(otherCard.suit) && pointValue == otherCard.pointValue)
    {
      return true;
    }
    else
      return false;
  }

  // the @override annotation means that the method original method "toString" in
  // the Object's class is being overrided in this Card class
  @Override
  // Output all information concerning the card in a string format to make it
  // easier to read
  public String toString()
  {
    return rank + " of " + suit + " (point value = " + pointValue + ")";
  }
}
