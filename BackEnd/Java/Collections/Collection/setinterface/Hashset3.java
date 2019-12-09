package Hashset;

import java.util.HashSet;

public class Hashset3 
{
	public static void main(String[] args) 
	{
		HashSet<Student> h1=new HashSet<Student>();
		h1.add(new Student(22,"divya"));
		h1.add(new Student(23, "ramesh"));
		h1.add(new Student(22, "divya"));
		
		for (Student student : h1) {
			System.out.println(student.studAge +"the name is "+ student.studName);
		}
	}
}
