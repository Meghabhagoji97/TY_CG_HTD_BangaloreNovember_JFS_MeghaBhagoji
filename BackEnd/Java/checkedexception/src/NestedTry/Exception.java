package NestedTry;

import CheckedExceptionpkg.Employee;

public class Exception 
{
	public static void main(String[] args)
	{
		System.out.println("main started");
		
		Employee e1=new Employee();
		try {
			Object o1=e1.clone();
		
		
		try {
			Class c1=Class.forName("Employee");
		} catch (ClassNotFoundException e)
		{
			System.out.println("class not supported");
			
		}
		} catch (CloneNotSupportedException e)
		{
				System.out.println("clone not supported");	
		}
	}
}
