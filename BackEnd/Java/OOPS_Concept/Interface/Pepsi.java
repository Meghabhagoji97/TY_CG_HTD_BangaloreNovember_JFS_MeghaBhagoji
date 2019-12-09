package Interface;

public class Pepsi implements Bottle
{
	public void open()
	{
		System.out.println("open the pepsi bottle");
	}
	public void drink()
	{
		System.out.println("drink the pepsi");
	}
	
	public void juice()
	{
		System.out.println("overidden juice method");
	}
}
