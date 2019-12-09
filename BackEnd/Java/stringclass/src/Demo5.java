
public class Demo5
{
	public static void main(String[] args)
	{
		String s1=new String("megha");
		System.out.println(s1.hashCode());
		
		s1=s1.concat("bhagoji");
		System.out.println(s1.hashCode());
		
	System.out.println("...................................");
		
		StringBuffer s2=new StringBuffer("megha");
		System.out.println(s2.hashCode());
		
		s2=s2.append("bhagoji");
		System.out.println(s2.hashCode());
		System.out.println("...................................");
		
		StringBuilder s3=new StringBuilder("megha");
		System.out.println(s3.hashCode());
		
		s3=s3.append("bhagoji");
		System.out.println(s3.hashCode());
		
		
		
	}
}
