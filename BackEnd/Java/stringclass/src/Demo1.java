
public class Demo1 
{
	public static void main(String[] args) 
	{
		String s1="john";
		System.out.println(s1.hashCode());
		
		s1="pinky";
		
		
		String s2="michel";
		System.out.println(s2.hashCode());
		
		String s3="john";
		System.out.println(s1.hashCode());
		
		System.out.println(s3.hashCode());
		
	}
}
