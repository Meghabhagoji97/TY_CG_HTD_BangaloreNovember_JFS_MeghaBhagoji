package com.cgi.access.pkg2;

import com.cgi.access.pkg1.Student;

public class TestStudent  extends Student
{
	TestStudent(int num)
	{
		super(num);
	}
	
	
	void details()
	{
		System.out.println("the digit is"+a);
	}
	public static void main(String[] args)
	{
		TestStudent s1=new TestStudent(300);
		s1.details();
		s1.StudDetails();
		
	}
}
