package FinalVariable;

public class InstantBlock 
{
	final int a;
	static double pi;
	
	public InstantBlock(int a) 
	{

		System.out.println("constructor is executing");
	}
	
	{
		System.out.println("instant initializer is executing");
		a=3000;
	}
	
	static
	{
		System.out.println("static block executing");
		pi=3.142;
	}
}
