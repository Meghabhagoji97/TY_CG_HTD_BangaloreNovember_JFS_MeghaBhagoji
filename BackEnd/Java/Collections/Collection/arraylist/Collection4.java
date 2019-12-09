import java.util.*;

public class Collection4
{
	
	public static void main(String[] args) 
	{
		List l1=new ArrayList();
		
		l1.add(0, 11);
		l1.add(1, 12);
		l1.add(2, 13);
		System.out.println(l1);
		
//		l1.remove(1);
//		System.out.println(l1);
		l1.add(14);
		l1.add(15);
		l1.add(13);
		
		List l2= new ArrayList();
				l2.add(100);
		l2.add(200);
		System.out.println(l1);
		System.out.println(l1.indexOf(13));
		System.out.println(l1.lastIndexOf(13));
		System.out.println(l1.get(4));
		l2.set(1, 300);
		System.out.println(l2);
		
		l2=l1.subList(0,1);
		System.out.println(l2);
		
	}
}
