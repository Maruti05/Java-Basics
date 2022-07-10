package com.maruti.test;

import com.maruti.main.AccessDemo;

public class AccessMidifile extends AccessDemo{
public static void main(String[] args) {
	AccessDemo d=new AccessDemo();
	d.printName(45);
	//d.printNumber(45); this method not visible to AccessMidifile class bcz method is private
	AccessMidifile c=new AccessMidifile();
	c.landProperty(44545);
	
	//d.printnum(78);
}
}
