package CheckedExceptionpkg;

public class ExceptionA 
{
	public static void main(String[] args) 
	{
		System.out.println("main started");
		
		try
		{
			Class c1=Class.forName("CheckedExceptionpkg.Person");
			System.out.println("class found");
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("class not found");
		}
		
		System.out.println("main ended");
	}
}
