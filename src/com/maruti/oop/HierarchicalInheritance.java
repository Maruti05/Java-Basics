package com.maruti.oop;
//Parent
class Employee{
	
	double salary;
	
	String companyName;
}
//Child one
class Developer extends Employee{
	
	String tech;
	
}

//Child two
class Tester extends Employee{
	
	String work;
}

//Hierarchical Inheritance-->Multiple Childs will acquires properties from single Parent
public class HierarchicalInheritance {

	
	public static void main(String[] args) {
		
		Developer dev=new Developer();
		dev.companyName="Google";
		dev.salary=45265;
		dev.tech="Java";
		
		
		Tester ts=new Tester();
		ts.companyName="Google";
		ts.salary=45454;
		ts.work="Testing";
		
	}
}
