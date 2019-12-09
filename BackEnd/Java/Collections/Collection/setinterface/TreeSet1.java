package TreeSet;

import java.util.TreeSet;

public class TreeSet1
{
	public static void main(String[] args) 
	{
		TreeSet t1=new TreeSet();
		t1.add(23);
		t1.add(89);
		t1.add(45);
		t1.add(56);
		t1.add(56);
		
		
		for (Object o1 : t1)
		{
			System.out.println(o1);
		}
	}
}
