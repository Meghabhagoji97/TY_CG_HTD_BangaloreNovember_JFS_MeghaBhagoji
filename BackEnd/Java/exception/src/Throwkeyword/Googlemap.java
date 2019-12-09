package Throwkeyword;

public class Googlemap
{
	void Findlocation(String loc)
	{
		try
		{
		System.out.println(loc.length());
		}
		catch(NullPointerException e)
		{
			System.out.println("Google map: enter the location name ");
			throw e;
		}
		
	}
}
