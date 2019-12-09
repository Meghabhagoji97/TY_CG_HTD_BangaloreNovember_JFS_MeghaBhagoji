package Constructor;

public class TestEmployee
{
	public static void main(String[] args) 
	{
		Employee e1=new Employee(20, "anu", 30000);
		//e1.details();
		System.out.println("name "+e1.empName+"age "+e1.empAge+"sal "+e1.empSal);

	}
}
