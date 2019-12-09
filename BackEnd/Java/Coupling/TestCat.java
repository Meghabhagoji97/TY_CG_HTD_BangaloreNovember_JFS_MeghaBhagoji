package Coupling;

public class TestCat 
{

	public static void main(String[] args)
	{
		Chips c=new Chips();
		Kurkure k=new Kurkure();
		Bingo b=new Bingo();
		Lays l=new Lays();
		Cat c1=new Cat();
		c1.feed(c);
		
	}
}
