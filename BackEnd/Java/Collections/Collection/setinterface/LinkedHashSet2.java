package LinkedHashSet;

import java.util.LinkedHashSet;

public class LinkedHashSet2
{
	public static void main(String[] args)
	{
		LinkedHashSet<Integer> h1= new LinkedHashSet<Integer>();
		h1.add(100);
		h1.add(200);
		h1.add(300);
		h1.add(null);
		
		for (Integer integer : h1) 
		{
			System.out.println(integer);
		}
	}
}
