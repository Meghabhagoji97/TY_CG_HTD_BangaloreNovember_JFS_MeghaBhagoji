package com.cgi.threads.creatingthreads;

public class IRCTCUser extends Thread
{
	IRCTC i;

	public IRCTCUser(IRCTC i) {
		super();
		this.i = i;
	}
	public void  run()
	{
		i.confirmedTicket();
	}
	
	 
}
