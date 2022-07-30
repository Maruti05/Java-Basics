package com.maruti.test;

import java.util.Scanner;

public class InputFromUser {

	
	public static void main(String[] args) {
		
		int a=45;
		Scanner sc=new Scanner(System.in); // Creating object of scanner
		int b=sc.nextInt();
		
		System.out.println(b);
		
		float c=sc.nextFloat();
		
		double z=sc.nextDouble();
		
		byte n=sc.nextByte();
		
		String s=sc.next();  // it will read only word (until Space )
		System.out.println(s);
		String line=sc.nextLine(); //it will read entire line
		System.out.println(line);
	}
}
