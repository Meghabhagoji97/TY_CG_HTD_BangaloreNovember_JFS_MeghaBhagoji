
public class TestB 
{
	String s1=null;
	void write()
	{
		System.out.println("wrtie method started");
		try
		{
		System.out.println(s1.length());
		}
		catch(NullPointerException e)
		{
			System.out.println("cannot find the length of the null");
		}
		System.out.println("write method ended");
	}
	public static void main(String[] args) 
	{
		System.out.println("main method started");
		TestB t1=new TestB();
		t1.write();
		System.out.println("main method ended");
	}
}
