package com.maruti.main;

public class Factorial {
	public static void main(String[] args) {
		int a = 5; // 5*4*3*2*1=120
		int fact = 1;
		for (int i = 2; i <= a; i++) {
			fact = fact * i;
		}

		System.out.println("factorial of " + a + " is = " + fact);
	}
}
