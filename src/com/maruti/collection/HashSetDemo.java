package com.maruti.collection;

import java.util.HashSet;
import java.util.Set;

//Sets-->1. unordered set of elements 
       //2. doesn't allow us to store the duplicate items
       //2. at most only one null values can be stored 
public class HashSetDemo {

	
	public static void main(String[] args) {
		//Hashset use Hash table for storing data
		Set<Integer>  set=new HashSet<Integer>();
		set.add(4);
		set.add(7);
		set.add(89);
		set.add(26);
		set.add(72);
		System.out.println(set); //unordered
		
		set.add(7);
		set.add(72);
		System.out.println(set);// not allow duplicates
		
		set.add(null);
		set.add(null); //hash value of Null always 0 index
		System.out.println(set); //allow only one null value
	}
}
