
public class TestDemo4
{
	public static void main(String[] args) 
	{
		Demo4 d1= new Demo4(25, "john");
		
		int age=d1.getAge();
		System.out.println(d1.hashCode());
		String name=d1.getName();
		
		Demo4 d2=new Demo4(24, "pinky");
		System.out.println(age);
		System.out.println(name);
		
	}
}
