package Initialization;

public class Person
{
	int age;
	String name;
	
	void personDetails()
	{
		System.out.println("the name is "+name+" the age is "+age);
	}
	void initialize(int a, String s)
	{
		age=a;
		name=s;
	}
}
