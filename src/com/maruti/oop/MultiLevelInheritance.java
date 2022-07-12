package com.maruti.oop;

//PARENT class
class Animals {
	String family;

	public void eat() {
		System.out.println("Animal is eating ");
	}
	
}

//CHILD of animals
class Dogs extends Animal{
	String type;

	
	
	public void barking() {
		System.out.println("Dog is barking");
	}
}

//child of Dogs
class BabyDog extends Dog{
	String color;

	public void barkingBaby() {
		System.out.println("baby dog barks slowly ");
	}

}

//Multilevel inheritance -->When there is a chain of inheritance, it is known as multilevel inheritance
//Multilevel inheritance-->here child will inherits father properties then father inherits Grand Father properties

public class MultiLevelInheritance {

	
	public static void main(String[] args) {
		Dogs d=new Dogs();//Dogs+Animal
		
		d.family="";
		d.type="";
		d.eat();
		d.barking();
		
		BabyDog bd=new BabyDog();//babyDog+Dogs+Animal
		
		bd.color="";
		bd.family="";
		bd.type="";
		bd.barking();
		bd.barkingBaby();
		bd.eat();
				
	}
}
