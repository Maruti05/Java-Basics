package com.maruti.oop;

public class HandlerEncap {
	public static void main(String[] args) {
		 LaptopEncap l=new LaptopEncap();
		 //setter
		 l.setId(45);
		 l.setBrandName("ACcer");
		 l.setPrice(4567.25);
		 
		 //getter
		 System.out.println(l.getId());
		 System.out.println(l.getBrandName());
		 System.out.println(l.getPrice());
	}
}
