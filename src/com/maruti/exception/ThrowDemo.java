package com.maruti.exception;

public class ThrowDemo {
	
	//throw keyword is used to throw an exception explicitly.
	//we can aslo Throw custom/own exception.
public static void main(String[] args) throws NegativeNumNotAllowed  {
	int num=-89;
	
	if(num<0) {
		throw new NegativeNumNotAllowed("Negative Numbers are Not allowed");
	}
	else {
		System.out.println("Good to Go!!");
	}
}
}
