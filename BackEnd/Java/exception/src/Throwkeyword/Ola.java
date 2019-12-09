package Throwkeyword;

public class Ola
{
	Googlemap g1 ;

	public Ola(Googlemap g1) {
		super();
		this.g1 = g1;
	}
	void find(String a)
	{
		try
		{
		g1.Findlocation(a);
		}
		catch(NullPointerException e1)
		{
			System.out.println("Ola: enter the location name");
		}
		
	}
	
}
