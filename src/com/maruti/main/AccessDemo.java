package com.maruti.main;

public class AccessDemo {
//Method Name(camel case)--->first letter of word should capital except first word 
	
	//public
	public void printName(int a) // method header/signiture
	{//we can access anywhere in project ex:public toilet
		// method body
		System.out.println(a);
	}
	
	//private
	private void printNumber(int b) {
		//we can access with in this class only ex:private toilets
		System.out.println(b);
	}
	//protected
	protected void landProperty(int o) {
		//we can access this method in child class(inheritance)
		System.out.println(o);
		
	}
	
	//default
	 void printnum(int b) {
		 //we can access this method only in same package
		System.out.println(b);
	}
}
