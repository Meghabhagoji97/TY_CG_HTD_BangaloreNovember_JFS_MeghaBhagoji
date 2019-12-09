
public class TestPerson 
{
	public static void main(String[] args) throws Throwable 
	{
		System.out.println(".......Main method started.....");
		
		Person p1 =new Person("pinky");
		p1.finalize();//explicitly calling finalize so the gc() will not execute
		p1=null;
		System.gc();
		System.out.println(".....main ended......");
	}
}
