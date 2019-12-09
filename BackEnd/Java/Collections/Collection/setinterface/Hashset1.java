package Hashset;

import java.util.HashSet;

public class Hashset1
{
	public static void main(String[] args) 
	{
		HashSet s1=new HashSet();
		s1.add(23);
		s1.add(34);
		s1.add(56);
		s1.add(67);
		s1.add(null);
		
		System.out.println(s1);
		for (Object object : s1) {
			System.out.println(object);
		}
			System.out.println("-------------------------------");
		HashSet<String>h1=new HashSet<String>();
		h1.add("megha");
		h1.add("karthik");
		h1.add("arun");
		h1.add("kiran");
		h1.add(null);
		h1.add(null);
		
		for (String string : h1) 
		{
			System.out.println(string);
		}
			
		}
	
}
