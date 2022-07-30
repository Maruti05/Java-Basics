package com.maruti.exception;

public class FinallyBlock {

	
	public static void main(String[] args) {
		try {
			int a=7/0;
			System.out.println("Ans "+a);
		} 
		catch (ArithmeticException e) {
			System.out.println("Divide By Zero exception");
		}
		//Finally block will executes irrespective of try and catch Block
		//Finally mostly used in Resource Closing operation
		//application : closing a file, closing connection,
		finally {
           System.out.println("Closeed all Resource");
		}
		
		
	}
}
