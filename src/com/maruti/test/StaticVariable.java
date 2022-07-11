package com.maruti.test;

class College {

	String dept;

	static String principle; // when u have common variable /method for all Object go for static
								// it will save memory how ?--->instead of defining multiple time same thing we
								// can define on time
								// only one copy will be share with all object
	
	//static variable gets memory only once in the class area at the time of class loading
	
	public static void signiture() {
		System.out.println("abc sig");
		
	}
}

class StaticVariable {
	public static void main(String[] args) {
		College.principle = "abc";

		College c = new College();
		c.dept = "EC";
		College.signiture();

		College c2 = new College();
		c2.dept = "CS";
		College.signiture();

		College c3 = new College();
		c3.dept = "Mech";
		College.signiture();

		System.out.println(c.principle);
		System.out.println(c2.principle);
		System.out.println(c3.principle);
	}
	
	static{
		
		
		//static block
		
	}
	
	//heap memory-->Objects,instance variable/method ex: new College()
	//class area--->Class,static variable/method ex: String principle
	//stack memory--->local variable,object reference ex:c,c2,c3
}


//main/outer class
class Govt{
	
	
	//inner class
	 static class  party{
		
	}
}


