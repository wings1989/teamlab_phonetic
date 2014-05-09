package de.unistuttgart.ims;

public class Word {
	
	
	private double[] sounds; // make sure the sounds are within the range 0...100

	/**
	 * The group of the original speaker. This label is kept in
	 * the memory of the listener.
	 */
	private Group originalGroup;
	
	
	/**
	 * Construct a new word
	 */
	public Word() {
		//TODO implement
	}
	
	/**
	 * Get the similarity of this word to the other word
	 * @param other
	 * @return a similarity value
	 */
	public double getSimilarity(Word other) {
		//TODO implement
		return 0.0D;
	}
}
