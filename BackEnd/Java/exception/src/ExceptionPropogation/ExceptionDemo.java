package ExceptionPropogation;

public class ExceptionDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("main started");
		m1();
		System.out.println("main ended");
	}
	public static void m1()
	{
		System.out.println("m1() started");
		m2();
		System.out.println("m1() ended" );
	}
	public static void m2()
	{
		System.out.println("m2()  started");
		try
		{
			System.out.println(10/0);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("m2() ended");
	}
}
