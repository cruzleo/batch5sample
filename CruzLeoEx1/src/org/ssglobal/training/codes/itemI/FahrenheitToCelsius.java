package org.ssglobal.training.codes.itemI;

public class FahrenheitToCelsius {
	public static void main(String[] args) {
		//declare and initialize data
		double celsius;
		double fahrenheit = 22.6;
		
		//calculate celsius equivalent
		celsius = (fahrenheit - 32) * 5 / 9; 
		//output results
		System.out.println("Fahrenheit = " + fahrenheit + " \u00B0F");
		System.out.println("Celsius = " + celsius + " \u00B0C");
	}
}

/*
 *compiler errors: 
 * Celsius data type should be in double and not initialized.
 * Fahrenheit data type should be in double.
 * The computation for celsius should not have a data type since its already declared
 * printing fahrenheit instead of "," it should be "+". 
 * printing celsius instead of "," it should be "+".
 * the value that output the sysmbol for fahrenhiet is wrong, should start small letter.
 * sysmbol for celsius should have a "\" before the value. 
 * 
 * logical errors:
 * Celsius data type should be in double and not initialized.
 * Fahrenheit data type should be in double.
 * The computation for celsius should not have a data type since its already declared
 * 
 *readability errors:
 * output should have the word fahrenheit and celsius instead of just symbol
 * 
 * 
 */
