package Coupling;

public class Crush 
{
	void receive(Phone p)
	{
		if(p instanceof Oppo)
		{
			System.out.println("its an Oppo");
		}
		else if(p instanceof Vivo)
		{
			System.out.println("its a Vivo");
		}
		else if( p instanceof Apple)
		{
			System.out.println("Its an Apple");
		}
		else
		{
			System.out.println("no phone");
		}
	}
	
	
}
