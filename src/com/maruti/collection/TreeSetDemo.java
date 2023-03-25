package com.maruti.collection;

import java.util.Set;
import java.util.TreeSet;

// 1.tree DS for storage
//2 . reeSet  contains unique elements
//3.access and retrieval time of TreeSet is quite fast
//4. elements in TreeSet stored in ascending order.
public class TreeSetDemo {
public static void main(String[] args) {
	Set<Integer> tree=new TreeSet<Integer>();
	
	tree.add(45);
	tree.add(2);
	tree.add(78);
	tree.add(0);
	
	System.out.println(tree);
}
}
