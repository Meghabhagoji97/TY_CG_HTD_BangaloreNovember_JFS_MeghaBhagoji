package Interface;

public class TestBottle
{
	public static void main(String[] args)
	{
//		Fanta f1=new Fanta();
//		
//		f1.open();
//		f1.drink();
		
		System.out.println("..........................");
		Pepsi p1=new Pepsi();
		p1.open();
		p1.drink();
		p1.juice();
		
		Bottle.close();
	}
}
