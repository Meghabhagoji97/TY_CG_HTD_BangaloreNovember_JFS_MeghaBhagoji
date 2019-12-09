package com.cgi.threads.creatingthreads;

public class TestThread2 
{
	public static void main(String[] args) {
		
		System.out.println("main method started");
		Thread2 t2= new Thread2();
		 Thread t = new Thread(t2);
		 t.start();
		 System.out.println("main method ended");
		 
		}
}
