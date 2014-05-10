package de.unistuttgart.ims;

public class Sneetch {
	
	
	private Group groupID;
	
	private Lexicon lex;
	
	/**
	 * Construct a new Sneetch which belongs to a specific group
	 * @param g
	 */
	public Sneetch(Group g) {
		this.groupID = g;
		
		this.lex = new Lexicon();
		
		//TODO finish...
	}
	
	
	/**
	 * Produce a new utterance
	 * @return
	 */
	public Utterance speak() {
		//TODO implement
		
		// A Sneetch produces more than one word in each cycle,
		// so w use the class Utterance to represent the list of
		// produced words
		return new Utterance();
	}
	
	
	/**
	 * Listen to a new utterance and store its word exemplars
	 * in memory
	 * 
	 * @param u
	 */
	public void listen(Utterance u) {
		//TODO implement
	}

}
