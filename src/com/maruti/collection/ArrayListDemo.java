package com.maruti.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListDemo {

	//List-->1.store the ordered collection of objects 2. It can have duplicate values
	
	//ArrayList impliments List interface
	public static void main(String[] args) {
		
		/*ArrayList-->1. dynamic array 
		 * 2. stores duplicate values 
		 * 3. stores different data types values
		 * 4. maintains the insertion order
		 * 5. it is non-synchronized
		 * */
		
		List<Integer> list =new ArrayList<>();
		
		//insert
		list.add(485);  //0 index
		list.add(45); // 1 index
		list.add(7); // 2 index
		
		//get   ,access
		System.out.println(list.get(0)); 
		System.out.println(list.get(2)); 
		
		System.out.println("Size of List  : "+list.size());
		
		//delete
		System.out.println(list);
		list.remove(0);
		System.out.println(list);
		
		System.out.println(list.contains(7)); //true	
	   System.out.println(list.contains(17)); //false
	  
	   
	     list.set(1, 2);
	  
		System.out.println( list );
		list.clear();
		
		System.out.println(list);
		
	}
}
