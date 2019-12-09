package ExceptionPropogation;

public class A
{
	static void m1()
	{
		try
		{
		System.out.println(10/0);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
			throw e;
		}
	}
}
