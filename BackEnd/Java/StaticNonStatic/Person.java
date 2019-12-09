package StaticNonStatic;

public class Person 
{
	static int age;
	String name;
	
	void personDetails()
	{
		System.out.println("name"+name+"age"+age);
		personDetailsstatic();
	}
	static void personDetailsstatic()
	{
		System.out.println(age);
	}
}
