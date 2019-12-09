package ExceptionPropogationForThrows;

public class D 
{
	static void o() throws ClassNotFoundException
	{
		System.out.println("o() method is called");
		Class.forName("A");
		System.out.println("o() method ended");
	}
}
