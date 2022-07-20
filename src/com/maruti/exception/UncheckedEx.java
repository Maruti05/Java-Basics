package com.maruti.exception;
//UnChecked Exception: it will check at run time
public class UncheckedEx {
public static void main(String[] args) {
	int[] ar=new int[]{4,8,2,4};
	
	
	
	try {
		System.out.println(ar[5]);
	} catch (ArrayIndexOutOfBoundsException e) {
	System.err.println("Array lenght is too short");
	}
 }
}
