package com.cgi.threads.creatingthreads;

public class TestIRCTC 
{
	public static void main(String[] args)
	{
		System.out.println("main started");
		IRCTC i1= new IRCTC();
		IRCTCUser u1= new IRCTCUser(i1);

		u1.start();

		IRCTCUser u2= new IRCTCUser(i1);
		

		u2.start();
		i1.leaveMe();
		System.out.println("main ended");
	}
}
