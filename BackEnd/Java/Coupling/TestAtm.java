package Coupling;

public class TestAtm 
{
	public static void main(String[] args)
	{
		Bank b=new Bank();
		//b.insertCard();
		//b.withDraw();
		
		Hdfc h=new Hdfc();
		h.anyCard(b);
		
		Sbi s=new Sbi();
		s.insertCard();
		s.withDraw();
	}
}
