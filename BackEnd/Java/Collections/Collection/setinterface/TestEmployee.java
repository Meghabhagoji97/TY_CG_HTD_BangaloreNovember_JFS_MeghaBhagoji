package TreeSet;

import java.util.TreeSet;

public class TestEmployee 
{
	public static void main(String[] args)
	{
		EmployeeAge ea=new EmployeeAge();
		EmployeeName en=new EmployeeName();
		EmployeeSal es=new EmployeeSal();
		TreeSet<Employee> e1=new TreeSet<Employee>(en);
		e1.add(new Employee(22, "ramu", 12000));
		e1.add(new Employee(23, "megha", 56000));
		e1.add(new Employee(25, "arun", 78000));
		e1.add(new Employee(21, "karthik", 34000));
		
		for (Employee e2 : e1) {
			
			System.out.println(e2);
		}
	}
}
