package org.ssglobal.training.codes.itemA;

class Oops {
	public static int a = 7;
	public static int b = 42;
	public static int smaller = minimum(a, b);
	
	public static void main(String[] args) {
		if (smaller == a) {
			System.out.println("a is the smallest!");
		} else {
			System.out.println("b is the smallest!");
		}
	}
	
	/*
	 * returns which int is smaller
	 */
	public static int minimum(int a, int b) {
		int smaller = 0;
		
		if (a < b) {
			 smaller = a;
		} else if (a >= b) {
			 smaller = b;
		}
		return smaller;	
	}
}
//correct code ito. 
