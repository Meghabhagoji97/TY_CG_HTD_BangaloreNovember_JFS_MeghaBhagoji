package ExceptionPropogationForThrows;

public class A {

	public static void main(String[] args) 
	{
		System.out.println("main method started");
		try
		{
		B.m();
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("class not found");
		}
		System.out.println("main ended");
	}
}
