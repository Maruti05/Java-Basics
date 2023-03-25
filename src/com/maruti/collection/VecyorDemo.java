package com.maruti.collection;

import java.util.List;
import java.util.Vector;

public class VecyorDemo {
//1.Vector uses a dynamic array to store the data elements. It is similar to ArrayList. 
//	It is synchronized
	
	public static void main(String[] args) {
		List<Character> ch=new Vector<>();
		ch.add('C');
		ch.add('a');
		
		ch.get(0);
	}
}
