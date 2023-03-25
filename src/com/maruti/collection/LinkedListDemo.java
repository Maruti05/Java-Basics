package com.maruti.collection;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
//1.It uses a doubly linked list internally to store the elements
	//2.It can store the duplicate elements
	//3.It maintains the insertion order
	//4. is not synchronized.
	//5.LinkedList, the manipulation is fast because no shifting is required.
	public static void main(String[] args) {
		List<Integer> lList=new LinkedList<>();
		
		lList.add(45);
		lList.get(0);
	}
}
