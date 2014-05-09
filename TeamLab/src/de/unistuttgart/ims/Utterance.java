package de.unistuttgart.ims;

import java.util.ArrayList;
import java.util.Iterator;

public class Utterance implements Iterable<Word> {
	
	
	private ArrayList<Word> words;
	
	
	/**
	 * Construct an empty utterance
	 */
	public Utterance() {
		this.words = new ArrayList<Word>();
	}
	
	
	public void addWord(Word w) {
		this.words.add(w);
	}
	


	@Override
	public Iterator<Word> iterator() {
		return this.words.iterator();
	}

}
