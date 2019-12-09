import java.util.LinkedList;
import java.util.ListIterator;

public class LikedList1 
{
	public static void main(String[] args)
	{
		LinkedList l1=new LinkedList();
		l1.add(12);
		l1.add(23);
		l1.add(34);
		l1.add(44);
		
		System.out.println(l1);
		
		//l1.remove(new Integer(23));
		
		
		l1.add(34);
		System.out.println(l1);
		System.out.println("-----------------------------------------");
		l1.remove(new Integer(34));
		System.out.println(l1);
		System.out.println("-----------------------------------------------");
		l1.add(null);
		System.out.println(l1);
		System.out.println("-------------list iterator------------");
		ListIterator itr=l1.listIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("-------using for each------------");
		for (Object i1 : l1)
		{
			System.out.println(i1);
		}
		System.out.println("-----------for loop-----------");
		for (int i = 0; i <l1.size(); i++) {
			System.out.println(l1.get(i));
			
		}
		}
}
