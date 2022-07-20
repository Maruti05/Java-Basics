package com.maruti.oop;

//Multiple inheritance example
public class A4 implements Printable,Showable{

	@Override
	public void show() {
	System.err.println("Inside Show");
		
	}

	@Override
	public void print() {
		System.err.println("In side print");
		
	}

	public static void main(String[] args) {
		A4 paper=new A4();
		paper.print();
		paper.show();
	}
}
