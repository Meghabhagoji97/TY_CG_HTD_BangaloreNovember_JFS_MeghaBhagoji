package ThrowandThrows;

public class IRCTC 
{
	void confirmTicket() throws ClassNotFoundException
	{
		try {
			Class.forName("ThrowandThrows.Paytm");
			System.out.println("ticket comfirmed from IRCTC");
		} catch (ClassNotFoundException e)
		{
			System.out.println("ticket not confirmed try again!!!!");
			throw e;
		}
		
	}
}
