package com.maruti.collection;

import java.util.LinkedHashSet;
import java.util.Set;

//1.It also contains unique elements or does not allow duplicates
//2.insertion order or Ordered ways
//3.at most only one null values can be stored
public class LinkedHashset {
public static void main(String[] args) {
	Set<Integer> nums=new LinkedHashSet<Integer>();
	nums.add(45);
	nums.add(45);
	
	System.out.println(nums);
	nums.add(4);
	nums.add(7);
	nums.add(89);
	nums.add(26);
	nums.add(72);
	
	System.out.println(nums);
	
	nums.add(null);
	nums.add(null);
	System.out.println(nums);
	
}
}
