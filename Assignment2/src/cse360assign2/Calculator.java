/*
 * Name: Oscar Miguel Cruz
 * class ID: 491
 * Assignment 2
 * 
 * This file contains a calculator class. The purpose of this 
 * assignment is to practice version control.
 * 
 */

package cse360assign2;

/**
 * This class implements a calculator that has the basic operations:
 * addition, subtraction, multiplication, and division. It keeps a history
 * of the operations done.
 * The class contains a field to store the current total and a field to store a 
 * string of the history of actions.
 *
 */
public class Calculator {

	private int total;
	private String history;
	
	/**
	 * Default constructor that initializes the total to 0.
	 * Initializes history to the beginning value 0.
	 */
	public Calculator () {
		total = 0;  // not needed - included for clarity
		history = "0";
	}
	
	/**
	 * Returns the current total.
	 * 
	 * @return the current total
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * Adds the parameter to the current total.
	 * Adds the addition to the history.
	 * 
	 * @param value the value of the integer being added
	 */
	public void add (int value) {
		total += value;
		history += " + " + value;
	}
	
	/**
	 * Subtracts the parameter from the current total.
	 * Adds the subtraction to the history.
	 * 
	 * @param value the value that is being subtracted
	 */
	public void subtract (int value) {
		total -= value;
		history += " - " + value;
	}
	
	/**
	 * Multiplies the current total by the parameter.
	 * Adds the multiplication to the history.
	 * 
	 * @param value the value to multiply the total by
	 */
	public void multiply (int value) {
		total *= value;
		history += " * " + value;
	}
	
	/**
	 * Divides the current total by the parameter.
	 * If the value is 0, the total is set to 0.
	 * Adds the division to the history.
	 * 
	 * @param value the value to divide the total by
	 */
	public void divide (int value) {
		if (value == 0)
			total = 0;
		else
			total /= value;
		
		history += " / " + value;
	}
	
	/**
	 * Returns a string of the history of all actions
	 * 
	 * @return a string of past operations
	 */
	public String getHistory () {
		return history;
	}
}
