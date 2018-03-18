package main;

public class Consonant implements Letter {
	
	int value;
	
	public Consonant(int value) {
		this.value = value;
	}
	
	public char getValue() {
		return (char) value;
	}
	
	public int getIntValue() {
		return value;
	}

}
