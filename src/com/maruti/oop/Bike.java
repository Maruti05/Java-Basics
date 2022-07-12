package com.maruti.oop;

public class Bike extends Vehicle{
	
	//Bike--->derived class, extended class,Sub Class  or child class
	//Vehicle---> base class or  parent class,super class
	
	//inheritance-->a child will acquires all properties/feature from Parent class
	
	//to achive inheritance we will use "extends" keyword
	
	/*class child_class extends parent_class{
	 * 
	 * 
	 * 
	 * }
	 * */
	
	//usage:--->code re-usability 
	
	
	
	String model;
	
	int speed;
	
	double price;
	

	public static void main(String[] args) {
		
		Bike b=new Bike();
		b.id=123;
		b.name="Bazzaj";
		b.model="CVz";
		b.price=90000;
		b.type="Petrol engine";
		
		b.run();
	}
}
