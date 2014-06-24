package com.lexicalanalysis;

public class Word implements Comparable<Word>{
	private String name;
	private int frequency;
	
	/**
	 * Creates a word object with the provided
	 * name and a frequency of 1.
	 * 
	 * @param name The name of the word.
	 */
	public Word(String name) {
		this.name = name;
		this.frequency = 1;
	}
	
	/**
	 * Creates a word object with the provided
	 * name and frequency.
	 * 
	 * @param name The name of the word.
	 * @param frequency The frequency of the word.
	 */
	public Word(String name, int frequency) {
		this.name = name;
		this.frequency = frequency;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getFrequency() {
		return this.frequency;
	}
	
	/**
	 * Increments the words frequency by 1.
	 */
	public void increment() {
		this.frequency++;
	}
	
	/**
     * Compares the current Word's frequency with specified Word's frequency.
     * return zero if frequency for both Words is same .
     * return negative if comparing word's frequency is lesser than current one's.
     * return positive if comparing word's frequency is greater than current one's.
     * 
     * @param word The Word to compare current Word with.
     */
	@Override
	public int compareTo(Word word) {
		return word.getFrequency() - this.getFrequency();
	}
	
	public boolean equals(Word word) {
		
		if(this.getName().equals(word.getName())) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean equals(String string) {
		
		if(this.getName().equals(string)) {
			return true;
		} else {
			return false;
		}
	}
}
