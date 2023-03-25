package com.maruti.collection;

import java.util.List;
import java.util.Stack;

public class StackDemo {
	//It implements the last-in-first-out data structure(LIFO)
public static void main(String[] args) {
	Stack<Integer> stack=new Stack<>();
	stack.push(45);
	
	stack.push(1);
	System.out.println(stack);
	
	
	System.out.println(stack.pop());
	System.out.println(stack);
	
	System.out.println(stack.pop());
	System.out.println(stack);
}
}
