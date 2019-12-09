package LinkedHashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet3 
{
	public static void main(String[] args) 
	{
		LinkedHashSet s1= new LinkedHashSet();
		s1.add(new Employee(22, "ramu"));
		s1.add(new Employee(23, "sita"));
		s1.add(new Employee(22,"ramu"));
		
		Iterator<Employee> itr1= s1.iterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
	}
}
