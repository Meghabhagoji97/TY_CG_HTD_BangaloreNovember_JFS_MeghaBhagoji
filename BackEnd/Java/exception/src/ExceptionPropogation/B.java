package ExceptionPropogation;

public class B
{
	static void m2()
	{
		try
		{
		A.m1();
		}
		catch(ArithmeticException e)
		{
			System.out.println("B class"+ e.getMessage());
			throw  e;
		}
	}
}
