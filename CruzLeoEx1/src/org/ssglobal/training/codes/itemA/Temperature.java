package org.ssglobal.training.codes.itemA;

public class Temperature {

	public static void main(String[] args) {
		double tempf = 98.6;
		double tempc = 0.0;
		
		fToC(tempf, tempc);
	}
	
	public static void fToC(double tempf, double tempc) {
		//Converts Fahrenheit temperatures to Celsius.
		tempc = (tempf - 32) * 5 / 9;
		System.out.println("Body temp in C is: " + tempc);
	}

}
