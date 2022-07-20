package com.maruti.exception;

//Exception:  an exception is an event that disrupts the normal flow of the program.

//Exception Handling: Exception Handling is a mechanism to handle runtime errors
public class BasicException {

	public static void main(String[] args) {
		int num=9;
		int res=0;
	res= num/0;
		
		//we can handle exception using try-catch blocks
		try {
			//put the statement which might give exception
			 res=num/0;
		} catch (ArithmeticException e) {
			//put the statement to be executed after occur of exception
			System.out.println("oops !! try with different number");
		}
		System.out.println(res);
		System.out.println("Good bye");
	}
}
