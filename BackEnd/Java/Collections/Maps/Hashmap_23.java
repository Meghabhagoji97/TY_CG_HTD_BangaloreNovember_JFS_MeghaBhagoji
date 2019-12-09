package cfl.programs;
import java.util.*;
import java.util.HashMap;
import java.util.Map;

public class Hashmap_23 
{
	public static void main(String[] args)
	{
		Map<Integer,String> m=new HashMap<Integer,String>();
		
		m.put(10, "jsp");
		m.put(50, "qsp");
		m.put(30, "india");
		
		m.put(40, "banglore");
		m.put(20,"hebbal");
		m.put(60, "majestic");
		
		//Conversion of keys of hashmap to arraylist
		
		List l=new ArrayList(m.keySet());
		Iterator itr=l.iterator();
		while(itr.hasNext())
		{
			itr.next();
		}
		System.out.println(l);
	}
}
