package ThrowandThrows;

public class Paytm 
{
	IRCTC i1;

	public Paytm(IRCTC i1) {
		super();
		this.i1 = i1;
	}
	void bookTickets()
	{
		try {
			i1.confirmTicket();
			System.out.println("ticket confirmed from paytm");
		} catch (ClassNotFoundException e) {
			System.out.println("ticket  not confirmed");
		}
	}
}
