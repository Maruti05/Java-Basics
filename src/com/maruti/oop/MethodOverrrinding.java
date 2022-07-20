package com.maruti.oop;


//Polymorphism-->which we can perform a single action in different ways.
//types -->1) Runtime ploymorphism 2)Compile time polymorphism


//we have achieved  Runtime ploymorphism using Method Overriding
class Father{
	
	public void drive() {
		System.out.println("Father wants to drive Bike");
	}
}


class Son extends Father{

	public void drive() {
		System.out.println("Son wants to drive car");
	}
}




public class MethodOverrrinding {
	
	//MethodOverrrinding -->Same method are present in both parent and child ,
	//but the calling of method will be decided at the runtime depending upon which class object is created
	
	//to acheive Method Overrinding inheritance is needed
public static void main(String[] args) {
	
	Father f=new Father();
	
	f.drive();
	
	Father fs=new Son();
	fs.drive();
}
}
