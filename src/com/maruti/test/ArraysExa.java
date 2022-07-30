package com.maruti.test;

public class ArraysExa {
 public static void main(String[] args) {
	 
	 int b; //Declaration
	 
	 int c=45;//initialization 
	//[4,4,5,8,7,63]  -->single dimensional Array
	 /*
	  * [
	  * 1,6,8
	  * 4,8,0
	  * 4,8,0
	  * 5,7,9
	  * ]
	  * ---->MultiDimesional /2D  Array
	  * */
	 
	 //Declaration of An Array
	 int[] a;
	 
	 float marks[];
	 
	 double []salary;
	 
	 //initialization
	 //          0 1 2 3 4
	 int[] num= {4,5,7,8,3};
	 
	 System.out.println(num[2]); //accessing Array elements using Index
	 
	 System.out.println(num[0]);
	 
	 //iteration
	 for(int i=0;i<num.length;i++) {
		 System.err.println(num[i]);
	 }
	 //using enhanced for loop
	 for(int n:num) {
		 System.out.println(n);
	 }
	 
	 int[] v=new int[5]; //new int[Number of elements]
	 v[0]=4;
	 v[1]=3;
	 v[2]=5;
	 System.out.println("------------------------------------------------------------------------");
	 for(int j=0;j<v.length;j++) {
		 System.out.println(v[j]);
	 }
	 
}
}
