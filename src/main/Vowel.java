package main;

public class Vowel implements Letter {
	
	int value;
	
	public Vowel(int value) {
		this.value = value;
	}

	public char getValue() {
		return (char) value;
	}
	
	public int getIntValue() {
		return value;
	}
}

