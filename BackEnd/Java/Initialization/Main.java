package Initialization;

public class Main 
{
	public static void main(String[] args)
	{
		Person p1=new Person();
		p1.age=23;
		p1.name="john";
		p1.personDetails();
		
		Person p2=new Person();
		p2.initialize(20, "sony");
		p2.personDetails();
	}
}
