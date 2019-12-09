import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Arraylist1
{
public static void main(String[] args)
{
	ArrayList<Integer> a1=new ArrayList<Integer>();
	a1.add(10);
	a1.add(20);
	a1.add(30);
	System.out.println("----------for each method---------------");
	for (Integer i1 : a1) {
		System.out.println(i1);
	}
	System.out.println("-----------iterator method-----------");
	Iterator itr=a1.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	System.out.println("-----------list iterator method---------------");
	ListIterator<Integer> itr1=a1.listIterator(a1.size());
	while(itr1.hasPrevious())
	{
		System.out.println(itr1.previous());
	}
}
}
