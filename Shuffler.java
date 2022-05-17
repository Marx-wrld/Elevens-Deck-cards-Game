public class Shuffler
{
  // fields
  private static final int SHUFFLE_COUNT = 4; // Amount of times the shuffle
                                              // method is called
  private static final int VALUE_COUNT = 15; // Amount of numbers being put in
                                             // the array

  // This is the main method of this class that tests out the different shuffle
  // methods
  public static void main(String[] args)
  {
    // outputs the results of the perfect shuffle method
    System.out.println("Results of " + SHUFFLE_COUNT + " consecutive perfect shuffles:");
    int[] values1 = new int[VALUE_COUNT]; // fill out the array with a set
                                          // amount of numbers
    for (int i = 0; i < values1.length; i++)
    {
      values1[i] = i;
    }
    for (int j = 1; j <= SHUFFLE_COUNT; j++)
    {
      perfectShuffle(values1);
      System.out.print("  " + j + ":");
      for (int k = 0; k < values1.length; k++)
      {
        System.out.print(" " + values1[k]);
      }
      System.out.println();
    }
    System.out.println();

    // outputs the results of the selection shuffle method
    System.out.println("Results of " + SHUFFLE_COUNT + " consecutive efficient selection shuffles:");
    int[] values2 = new int[VALUE_COUNT]; // fill out the array with a set
                                          // amount of numbers
    for (int i = 0; i < values2.length; i++)
    {
      values2[i] = i;
    }
    for (int j = 1; j <= SHUFFLE_COUNT; j++)
    {
      selectionShuffle(values2);
      System.out.print("  " + j + ":");
      for (int k = 0; k < values2.length; k++)
      {
        System.out.print(" " + values2[k]);
      }
      System.out.println();
    }
    System.out.println();
  }

  // This method is known as the perfect shuffle for it splits the deck in half
  // then mix them up with each other by interchanging the order
  public static void perfectShuffle(int[] cards)
  {
    int[] shuffled = new int[52];
    int middle = (cards.length + 1) / 2;  //split the deck in two

    //Put the first half of the deck in the even numbered indexes 
    int k = 0;
    for (int j = 0; j < middle; j++)
    {
      shuffled[k] = cards[j];
      k += 2; 
    }

    //Put the second half of the deck in the odd numbered indexes
    k = 1;
    for (int j = middle; j < cards.length; j++)
    {
      shuffled[k] = cards[j];
      k += 2;
    }

    //Put all the shuffled deck back into cards
    for (int j = 0; j < cards.length; j++)
    {
      cards[j] = shuffled[j];
    }
  }

  // This method finds a random number among the unshuffled array and put it in
  // the shuffled array, repeat this till all cards have been shuffled.
  public static void selectionShuffle(int[] cards)
  {
    for (int k = cards.length - 1; k >= 0; k--)
    {
      int r = (int) (Math.random() * k);
      int position = cards[r];
      cards[r] = cards[k];
      cards[k] = position;
    }
  }
}
