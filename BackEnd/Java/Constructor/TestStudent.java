package Constructor;

public class TestStudent 
{
	public static void main(String[] args)
	{
		Student s=new Student();
		System.out.println(s.studName);
		System.out.println(s.studAge);
		
		Student s1=new Student("megha",22);
		System.out.println(s1.studName);
		System.out.println(s1.studAge);
	}
}
