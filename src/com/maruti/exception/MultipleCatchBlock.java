package com.maruti.exception;

//try with Multiple Catch is Possible .
//Within try block u can have try-catch.
//within Catch block u can have try-catch
public class MultipleCatchBlock {
 
	public static void main(String[] args) {
		int[] ar=new int[]{4,8,2,4};
		try {
			int a=5/1;
			System.out.println(ar[6]);
		}
		catch (ArithmeticException e) {
			System.out.println("Divide by Zero Exception");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array out of Bound Exception");
		}
	}
}
