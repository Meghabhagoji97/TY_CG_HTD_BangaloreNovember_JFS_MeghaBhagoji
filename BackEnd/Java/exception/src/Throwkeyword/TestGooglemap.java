package Throwkeyword;

public class TestGooglemap 
{
	public static void main(String[] args)
	{
		System.out.println("main started");
		Googlemap g1= new Googlemap();
		
		Ola o1=new Ola(g1);
		o1.find(null);
		System.out.println("main ended");
	}
}
