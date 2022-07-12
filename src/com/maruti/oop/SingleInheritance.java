package com.maruti.oop;
//PARENT class
class Animal {
	String family;

	public void eat() {
		System.out.println("Animal is eating ");
	}
	
}

//CHILD class
class Dog extends Animal{
	String type;

	
	
	public void barking() {
		System.out.println("Dog is barking");
	}
}

//class Cat extends Animal{
//	String color;
//
//	public void meowing() {
//		System.out.println("Cat is meowing");
//	}
//
//}

//single inheritance--> a child will inherites all the proprties from Parent.
// 1 child --> 1 parent
public class SingleInheritance {
public static void main(String[] args) {
	Dog dog=new Dog();
	dog.eat();
	dog.barking();
	dog.family="";
	dog.type="";
}

}
