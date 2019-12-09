import java.util.*;

public class Collection3
{
	public static void main(String[] args) 
	{
		Collection c3=new ArrayList();
		
		c3.add(10);
		c3.add(20);
		c3.add(30);
		c3.add(40);
		System.out.println(c3);
		System.out.println("........converting from collection  to array......");
		Object a[]=c3.toArray();
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("............................................");
		
Collection c4=new ArrayList();
		
		c4.add(100);
		c4.add(200);
		c4.add(300);
		c4.add(400);
		System.out.println(c4);
		c4.addAll(c3);
		System.out.println(c4);
		
		
		c4.retainAll(c3);
		System.out.println(c4);
		
		c4.removeAll(c3);
		System.out.println(c4);
		}
}
