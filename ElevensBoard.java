import java.util.List;

public class ElevensBoard extends Board {

	// Sets up the number of cards on the board
	private static final int BOARD_SIZE = 9;

	// Sets up the ranks of the cards
	private static final String[] RANKS = { "ace", "2", "3", "4", "5", "6",
			"7", "8", "9", "10", "jack", "queen", "king" };

	// Sets up the suits of the cards
	private static final String[] SUITS = { "spades", "hearts", "diamonds",
			"clubs" };

	// Sets up the point values of the cards
	private static final int[] POINT_VALUES = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
			0, 0, 0 };

	// Used control debugging print statements
	private static final boolean I_AM_DEBUGGING = false;

	// Creates a board from the super constructor
	public ElevensBoard() {
		super(BOARD_SIZE, RANKS, SUITS, POINT_VALUES);
	}

	// the @override annotation means that the method isLegal() in the
	// superclass "Board" class is being overrided in this Eleven's class
	@Override
	// This methods checks the cards the player selected to its corresponding
	// size methods to validate the actions
	public boolean isLegal(List<Integer> selectedCards) {
		// If two cards were selected, check it with containsPairSum11()
		if (selectedCards.size() == 2) {
			return containsPairSum11(selectedCards);
		}
		// If three cards were selected, check it with containsJQK()
		else if (selectedCards.size() == 3) {
			return containsJQK(selectedCards);
		}
		// If other numbers of cards were selected, it is an automatic illegal
		// move
		return false;
	}

	// the @override annotation means that the method anotherPlayIsPossible() in
	// the superclass "Board" class is being overrided in this Eleven's class
	@Override
	// This methods checks if another move can be made by the player
	public boolean anotherPlayIsPossible() {
		List<Integer> cIndexes = cardIndexes();
		// One of the remover methods have to be true for this method to return
		// true
		if (containsPairSum11(cIndexes) || containsJQK(cIndexes)) {
			return true;
		}
		return false; // If return false, the game is over and the player lost
	}

	// This is a helper method to check if the two cards selected adds up to 11
	private boolean containsPairSum11(List<Integer> selectedCards) {

		for (int numOne = 0; numOne < selectedCards.size(); numOne++) {
			int num1 = selectedCards.get(numOne).intValue(); // get the value
																// for the first
																// card
			for (int numTwo = numOne + 1; numTwo < selectedCards.size(); numTwo++) {
				int num2 = selectedCards.get(numTwo).intValue(); // get the
																	// value for
																	// the
																	// second
																	// card
				// check if the two cards adds up to 11
				if (cardAt(num1).pointValue() + cardAt(num2).pointValue() == 11) {
					return true;
				}
			}
		}
		return false;
	}

	// This is a helper method to check if the three cards selected are a jack,
	// a queen, and a king
	private boolean containsJQK(List<Integer> selectedCards) {
		boolean jack = false;
		boolean queen = false;
		boolean king = false;

		// Scan through the selected cards to check if they match the criteria
		for (Integer deck : selectedCards) {
			int k = deck.intValue();

			if (cardAt(k).rank().equals("jack")) {
				jack = true;
			} else if (cardAt(k).rank().equals("queen")) {
				queen = true;
			} else if (cardAt(k).rank().equals("king")) {
				king = true;
			}
		}
		return (jack && queen && king); // Returns true if all of them are
										// present
	}
}
