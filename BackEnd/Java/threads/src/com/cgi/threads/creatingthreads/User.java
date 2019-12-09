package com.cgi.threads.creatingthreads;

public class User  extends Thread
{
	PVR p;

	public User(PVR p) {
		this.p = p;
	}
	public void run()
	{
		p.confirmTicket();
	}
	
}
