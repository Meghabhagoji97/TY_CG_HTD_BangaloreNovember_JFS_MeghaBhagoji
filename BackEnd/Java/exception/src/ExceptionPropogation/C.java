package ExceptionPropogation;

public class C 
{
	static void m3()
	{
		try
		{
			B.m2();
		}
		catch(ArithmeticException e)
		{
			System.out.println("C  class"+ e.getMessage());
			
		}
		
	}
}
