package com.maruti.collection;

public class IntroToCollection {

	
	public static void main(String[] args) {
		int []num= new int[40];  //fixed memory size
		
		num[0]=1;
		num[1]=8;
		num[2]=7;
		num[3]=3;
		num[4]=7; //u can not increase size of Array
		
		for (int i = 0; i < num.length; i++) {
			int j = num[i];
			System.out.println(j);
		}
		
		
		
		int emp[] =new int[100]; //With respect to memory Arrays are not recommended
		
		/*here we have created an Array with a size of 100 .  but u have inserted only two 
		 *  elements in it. remaining 98 memory are unused/waste of memory */
		 
		emp[0]=4;
		emp[1]=8;
		
		
		int n[] =new int[100];
		n[0]=1;
		n[1]='a';
		//n[2]=45.65;  //Arrays can hold only homogeneous data types elements
		
		//There is no underlying data structure for arrays and hence ready made  method support is not available
		
	}
}
