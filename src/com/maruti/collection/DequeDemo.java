package com.maruti.collection;

import java.util.ArrayDeque;
import java.util.Deque;

//we can remove and add the elements from both the side
public class DequeDemo {

	public static void main(String[] args) {
		Deque< Integer> dq=new ArrayDeque<Integer>();
		
		
		dq.add(45);
		dq.add(2);
		dq.addFirst(7);
		dq.addLast(56);
		System.out.println(dq);
	}
}
