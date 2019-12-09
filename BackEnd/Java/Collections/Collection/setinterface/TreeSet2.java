package TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet2 
{
	public static void main(String[] args) {
		
		TreeSet<Student> t1= new TreeSet<Student>();
		t1.add(new Student(22, "divya"));
		t1.add(new Student(45, "param"));
		t1.add(new Student(56, "pinky"));
		
		Iterator<Student> itr=t1.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
