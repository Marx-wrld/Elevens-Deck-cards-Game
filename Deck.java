import java.util.List;
import java.util.ArrayList;

public class Deck {
	// fields
	private List<Card> cards; // filled with all the cards in the deck
	private int size; // number of cards left to be dealt

	// Constructor of the class that puts every card with its according
	// matched/paired up properties into one arraylist
	public Deck(String[] ranks, String[] suits, int[] values) {
		cards = new ArrayList<Card>();

		// All cards are added with its respective rank, suit and point value
		for (int r = 0; r < ranks.length; r++) {
			for (int s = 0; s < suits.length; s++) {
				Card card = new Card(ranks[r], suits[s], values[r]);
				cards.add(card);
			}
		}
		size = cards.size();
		shuffle(); // shuffle would be called here to display different sequence
					// of cards every run
	}

	// This method checks if the deck is empty, if it is, then it doesn't need
	// to be dealt with
	public boolean isEmpty() {
		if (size == 0) {
			return true;
		} else
			return false;
	}

	// This method checks and returns the number of undealt cards in the deck
	public int size() {
		return cards.size();
	}

	// This method finds a random card based on its corresponding location
	// number and put it in the "shuffled array" by switching the card at that
	// location with the last card.
	public void shuffle() {
		// Repeat the switching step until "k" has decreased to below zero
		for (int k = cards.size() - 1; k > 0; k--) {
			int howMany = k + 1;
			int start = 0;
			int randPos = (int) (Math.random() * howMany) + start;
			Card temp = cards.get(k);
			cards.set(k, cards.get(randPos));
			cards.set(randPos, temp);
		}
		size = cards.size(); // reset the size of the cards so the program can
								// run again
	}

	// This method deals the deck by getting one at a time, then decrease the
	// deck size to deal the next one until there are no more undealt cards left
	public Card deal() {
		if (size > 0) {
			size--;
			Card dealt = cards.get(size); // size will decrease by one each time
											// to get the next card
			return dealt;
		} else
			return null;
	}

	// the @override annotation means that the method original method "toString"
	// in the Object's class is being overrided in this Deck class
	@Override
	// Organizes, creates and outputs information of the deck in string form
	public String toString() {
		String rtn = "size = " + size + "\nUndealt cards: \n";

		// Returns all the undealt cards
		for (int k = size - 1; k >= 0; k--) {
			rtn = rtn + cards.get(k);
			if (k != 0) {
				rtn = rtn + ", ";
			}
			if ((size - k) % 2 == 0) {
				rtn = rtn + "\n";
			}
		}

		// Returns all the dealted cards
		rtn = rtn + "\nDealt cards: \n";
		for (int k = cards.size() - 1; k >= size; k--) {
			rtn = rtn + cards.get(k);
			if (k != size) {
				rtn = rtn + ", ";
			}
			if ((k - cards.size()) % 2 == 0) {
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\n";
		return rtn;
	}
}