public class DeckTester {
	// This is the main method of the program that creates three decks and test
	// all methods in the Deck class by outputting each deck's corresponding
	// informations
	public static void main(String[] args) {
		String[] rankOne = { "3", "5", "7" };
		String[] suitOne = { "Clubs", "Hearts" };
		int[] valueOne = { 3, 5, 7 };
		Deck deckOne = new Deck(rankOne, suitOne, valueOne);
		System.out.println("DeckOne is empty: " + deckOne.isEmpty());
		System.out.println("DeckOne size is: " + deckOne.size());
		System.out.println("DeckOne dealt card is: " + deckOne.deal());
		System.out.println();
		System.out.println(deckOne.toString());
		System.out.println();

		String[] rankTwo = { "Jack", "2", "4", "9" };
		String[] suitTwo = { "Hearts", "Spades", "Clubs" };
		int[] valueTwo = { 11, 2, 3, 9 };
		Deck deckTwo = new Deck(rankTwo, suitTwo, valueTwo);
		System.out.println("DeckTwo is empty: " + deckTwo.isEmpty());
		System.out.println("DeckTwo size is: " + deckTwo.size());
		System.out.println("DeckTwo dealt card is: " + deckTwo.deal());
		System.out.println();
		System.out.println(deckTwo.toString());
		System.out.println();

		String[] rankThree = { "8", "1", "King", "6", "Queen" };
		String[] suitThree = { "Diamonds", "Clubs", "Hearts", "Spades" };
		int[] valueThree = { 8, 1, 13, 6, 12 };
		Deck deckThree = new Deck(rankThree, suitThree, valueThree);
		System.out.println("DeckThree is empty: " + deckThree.isEmpty());
		System.out.println("DeckThree size is: " + deckThree.size());
		System.out.println("DeckThree dealt card is: " + deckThree.deal());
		System.out.println();
		System.out.println(deckThree.toString());

		// Creates a standard 52 cards deck to test the shuffle method.
		String[] rankFour = { "1", "2", "3", "4", "5", "6", "7", "8", "9",
				"10", "Jack", "Queen", "King" };
		String[] suitFour = { "Diamonds", "Clubs", "Hearts", "Spades" };
		int[] valueFour = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13 };
		Deck deckFour = new Deck(rankFour, suitFour, valueFour);
		System.out.println("DeckFour dealt card is: " + deckFour.deal());
		System.out.println(deckFour.toString()); // Display the whole deck to
													// test if shuffle has been
													// correctly implemented
	}
}