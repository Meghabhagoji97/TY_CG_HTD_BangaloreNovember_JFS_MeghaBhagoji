package com.cgi.threads.creatingthreads;

public class IRCTC 
{
	synchronized  void confirmedTicket()
	{
		for(int i=0;i<4;i++)
		{
			System.out.println(i);
			
			try
			{
				wait();
			}
			catch (Exception e) {
				e.printStackTrace();
			}
			
		
//		try
//		{
//			Thread.sleep(1000);
//		}
//		catch (Exception e) {
//			e.printStackTrace();
//		}
		}
		
	}
	synchronized void leaveMe()
	{
		System.out.println("notify is called");
		notifyAll();
	}
}
