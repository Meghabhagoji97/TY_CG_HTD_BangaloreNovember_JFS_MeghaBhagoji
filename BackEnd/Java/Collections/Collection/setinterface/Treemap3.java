package TreeSet;

import java.util.*;
import java.util.Map.Entry;

public class Treemap3 
{
	public static void main(String[] args)
	{
		ArrayList<Student1>l1=new ArrayList<Student1>();
		l1.add(new Student1("arun"));
		l1.add(new Student1("kiran"));
		
		ArrayList<Student1>l2=new ArrayList<Student1>();
		l2.add(new Student1("Karhtik"));
		l2.add(new Student1("Bhavni"));
		
		ArrayList<Student1>l3=new ArrayList<Student1>();
		l3.add(new Student1("Megha"));
		l3.add(new Student1("Adesh"));
		
		TreeMap<String ,ArrayList<Student1>> t1= new TreeMap<String ,ArrayList<Student1>>();
		t1.put("1st std", l1);
		t1.put("2nd std", l2);
		t1.put("3rd std", l3);
		
		Set<Entry<String, ArrayList<Student1>>> s1=t1.entrySet();
		//System.out.println(t1.get("1st std"));		
		for (Entry<String, ArrayList<Student1>> e1: s1) 
		{
			System.out.println(e1.getKey());
			System.out.println(e1.getValue());
		}
		
		
	}
}
