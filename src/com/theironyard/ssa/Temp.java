package com.theironyard.ssa;

public class Temp {

	private int inital;
	private boolean fahrenheit;

	public Temp(int inital) {
		this(inital, true);
	}

	public Temp(int inital, boolean fahrenheit) {
		this.inital = inital;
		this.fahrenheit = fahrenheit;

	}

	int displayInF() {
		if (this.fahrenheit) {
			return this.inital;
		}
		return (int) ((9 * this.inital) / 5.0) + 32;
	}

	int displayInC() {
		if (!this.fahrenheit) {
			return this.inital;
		}

		return (int) (((inital - 32) * 5) / 9);

	}

	int display() {
		return inital;

	}

	public static void main(String[] args) {

	}
	
	

}
