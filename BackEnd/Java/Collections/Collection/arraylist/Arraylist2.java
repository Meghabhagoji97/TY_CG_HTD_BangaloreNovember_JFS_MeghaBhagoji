import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Arraylist2
{
	public static void main(String[] args) 
	{
		System.out.println("------------array 1--------------");
		ArrayList<String> l1=new ArrayList<String>();
		l1.add("Megha");
		l1.add("karhtik");
		l1.add("kiran");
		l1.add("Arun");
		System.out.println(l1);
		
		System.out.println("------------array 2--------------");
		ArrayList<String> l2=new ArrayList<String>();
		l2.add("Adesh");
		l2.add("karhtik");
		l2.add("Bhavni");
		l2.add("Arun");
		
		System.out.println(l1);
		System.out.println(l1.size());
		System.out.println(l1.isEmpty());
		System.out.println(l1.contains("Megha"));
		l1.remove(1);
		System.out.println(l1);
		System.out.println(l1.containsAll(l2));
		System.out.println(l1.retainAll(l2));
		
		System.out.println("----list operations-----");
		l1.add(0, "Praveen");
		System.out.println(l1);
		//l1.remove(1);
		//System.out.println(l1);
		
		System.out.println(l1.indexOf("kiran"));
		l1.add("Megha");
		System.out.println(l1.lastIndexOf("Megha"));
		System.out.println(l1.get(2));
		System.out.println("-----for loop------");
		for(int i=0;i<l1.size();i++)
		{
			System.out.println(l1.get(i));
		}
		System.out.println("-----for each loop----");
		for (String s1 : l2) 
		{
			System.out.println(s1);
		}
		System.out.println("-----iterator--------");
		Iterator itr=l1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("------reversing the list------");
		ListIterator<String> itr2=l1.listIterator(l1.size());
		while(itr2.hasPrevious())
		{
			System.out.println(itr2.previous());
		}
		
		
		
		
	}
}
