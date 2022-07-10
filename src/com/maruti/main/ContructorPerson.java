package com.maruti.main;

public class ContructorPerson {
	public static void main(String[] args) {
		Person person = new Person(56, 60);

		System.out.println(person.age);
		System.out.println(person.weight);

		person.age = 45;

		System.out.println(person.age);

	}
}
