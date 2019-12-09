package ObjectClass;

public class Student 
{
	int studId;
	String name;

	public Student(int studId , String name) {
		super();
		this.studId = studId;
		this.name=name;
	}
	
	public String toString()
	{
		return name;
	}
}
