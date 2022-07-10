package com.maruti.main;

public class MethodType {

	// In java there are 2 type of methods 1)static method 2)instance method
	public static void main(String[] args) {

		
		MethodType.print();//u can access using Class name 
		
		MethodType m=new MethodType();
		m.display(); //to access instance method only with help of Object
		
		//m.print();
	}
	
	//1)static method
	
	public static int print() {
		
		System.out.println("inside static method");
		return 0;
	}
	//2)instance method
	public void display() {
		System.out.println("inside instance method");
		
	}
}
