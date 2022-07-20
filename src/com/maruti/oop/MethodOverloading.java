package com.maruti.oop;

//we will  achieve Compile time polymorphism  using Method Overloading
//Method Overloading====>If a class has multiple methods having same name but different in parameters, it is known as Method Overloading
public class MethodOverloading {

	
	public void add(int a) {
		System.out.println(a+0);
		
	}
	
	public void add(int a,int b) {
		System.out.println(a+b);
		
	}
	
	public void add(int a,double b) {
		System.out.println(a+b);
		
	}
	
	public void add(int a,double b, float c) {
		System.out.println(a+b+c);
		
	}
	
	/*Rules:
	 * 1.By changing number of arguments
       2.By changing the data type
	 * 
	 * */
	public static void main(String[] args) {
		MethodOverloading cal=new MethodOverloading();
		
		cal.add(5);
		cal.add(2, 5.6);
		cal.add(7, 2);
		cal.add(5, 2.5, 1.5f);
		
		
	}
	//Usage-->Method overloading increases the readability of the program.
}
