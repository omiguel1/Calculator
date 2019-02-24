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
 * The class contains a field to store the current total
 *
 */
public class Calculator {

	private int total;
	
	/**
	 * Default constructor that initializes the total to 0;
	 */
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 * Returns the current total.
	 * 
	 * @return the current total
	 */
	public int getTotal () {
		return 0;
	}
	
	/**
	 * Adds the parameter to the current total.
	 * 
	 * @param value the value of the integer being added
	 */
	public void add (int value) {
		
	}
	
	/**
	 * Subtracts the parameter from the current total.
	 * 
	 * @param value the value that is being subtracted
	 */
	public void subtract (int value) {
		
	}
	
	/**
	 * Multiplies the current total by the parameter.
	 * 
	 * @param value the value to multiply the total by
	 */
	public void multiply (int value) {
		
	}
	
	/**
	 * Divides the current total by the parameter.
	 * If the value is 0, the total is set to 0.
	 * 
	 * @param value the value to divide the total by
	 */
	public void divide (int value) {
		
	}
	
	/**
	 * Returns a string of the history of all actions
	 * 
	 * @return a string of past operations
	 */
	public String getHistory () {
		return "";
	}
}
