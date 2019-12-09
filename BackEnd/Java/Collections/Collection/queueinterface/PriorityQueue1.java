package com.cgi.queue.priorityqueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueue1
{
	public static void main(String[] args) {
		
	
	Queue p1= new PriorityQueue();
	p1.offer(10);
	p1.offer(20);
	p1.offer(40);
	p1.offer(30);
	
	System.out.println(p1);
	p1.poll();
	p1.poll();
	System.out.println(p1);
	
	p1.remove();
	System.out.println(p1);
	p1.offer(50);
	p1.offer(10);
	System.out.println(p1);
	p1.peek();
	System.out.println(p1);
	
	
	}
}
