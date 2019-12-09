
public class TestC 
{
	public static void main(String[] args)
	{
		System.out.println("main started");
		int a[]=new int[2];
		a[0]=10;
		a[1]=20;
		try
		{
		a[2]=30;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("enter the values according to the size specified");
		}
		
		System.out.println("main ended");
	}
}
