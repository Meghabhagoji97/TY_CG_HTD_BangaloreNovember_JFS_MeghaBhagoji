package LinkedHashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSEt1
{
	public static void main(String[] args)
	{
		
	LinkedHashSet l1= new LinkedHashSet();
	l1.add(10);
	l1.add(20);
	l1.add(30);
	l1.add(20);
	l1.add(null);
	
	Iterator itr1=l1.iterator();
	while(itr1.hasNext())
	{
		System.out.println(itr1.next());
	}
	
	}
}
