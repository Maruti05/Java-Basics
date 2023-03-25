package com.maruti.collection;

import java.util.PriorityQueue;
import java.util.Queue;

//Queue --> first-in-first-out order
public class PriorityQueueDemo {
	//PriorityQueue doesn't allow null values to be stored in the queue
public static void main(String[] args) {
	Queue<String> q=new PriorityQueue<String>(); 
	q.add("Ashok");
	q.add("Manju");
	q.add("Ravi");
	System.out.println(q);
	System.err.println(q.peek());//This method retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
	System.out.println(q);
	
	System.out.println(q.poll());//This method retrieves and removes the head of this queue, or returns null if this queue is empty.
	System.out.println(q);
}
}
