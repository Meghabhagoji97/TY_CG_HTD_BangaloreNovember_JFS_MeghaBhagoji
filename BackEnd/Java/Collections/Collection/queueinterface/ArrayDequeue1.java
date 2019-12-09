package com.cgi.queue.arraydequeue;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayDequeue1
{
	public static void main(String[] args) 
	{
		ArrayDeque<String> a1= new ArrayDeque<String>();
		a1.add("divya");
		a1.add("shree");
		a1.add("ramu");
		a1.add("anu");
		
		Iterator<String> itr=a1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		a1.addFirst("arun");
		System.out.println(a1);
		a1.removeFirst();
		System.out.println(a1);
		a1.removeLast();
		System.out.println(a1);
		a1.getFirst();
		System.out.println(a1);
		a1.remove();
		System.out.println(a1);
		a1.peek();
		System.out.println(a1);
	}
}
