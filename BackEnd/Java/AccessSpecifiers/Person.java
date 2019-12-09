package AccessSpecifiers;

public class Person 
{
	private String name;
	
	//constructor can be private
	 Person(String name)
	{
		this.name=name;
		System.out.println(name);
	}
	
	private void details()
	{
		System.out.println("the name is "+name);
	}
}
