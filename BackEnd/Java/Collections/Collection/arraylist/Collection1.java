import java.util.*;

public class Collection1 
{
	public static void main(String[] args) 
	{
		Collection c1= new ArrayList();
		//adding the objects to the collection
		c1.add(10);
		c1.add(23);
		System.out.println(c1);
		
		//removing the specific object of the collection
		c1.remove(10);
		System.out.println(c1);
		
		//finding the size of the collection
		System.out.println(c1.size());
		
		//checking for the empty collection
		System.out.println(c1.isEmpty());
		
		//checking whether the object is present or not
		System.out.println(c1.contains(10));
		
		
	}
}
