package com.maruti.main;

public class IfElseStatement {
	public static void main(String[] args) {
		int age = 10;

		if (age < 18) {
			System.out.println("person is child");
		} else {
			System.out.println("Person is Adult");
		}

		System.out.println("========================ELSE IF=============================");

		if (age < 18) {
			System.out.println("person is child");
			if (age < 10) {
				System.out.println("Person is Miner");
			}
		} else if (age < 25) {
			System.out.println("Person is Young");
		} else {
			System.out.println("Person is senior ");
		}
		System.err.println("======================SWITCH=========================");

		switch (age) {
		case 10: {
			System.out.println("Inside case age : " + age);
			break;
		}
		case 18: {
			System.out.println("Inside case age : " + age);
			break;
		}
		case 25: {
			System.out.println("Inside case age : " + age);
			break;
		}
		default: {
			System.out.println("age not in range");
			break;
		}
		}
	}
}
