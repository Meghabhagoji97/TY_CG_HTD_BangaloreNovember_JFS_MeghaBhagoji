import java.util.Vector;

public class Vector3 
{
	public static void main(String[] args) 
	{
		Vector v1= new Vector();
		v1.add(100);
		v1.addElement(300);
		v1.addElement(400);
		System.out.println(v1);
		
		v1.removeElement(new Integer(100));
		System.out.println(v1);
		v1.removeElementAt(0);
		System.out.println(v1);
		v1.add(500);
		v1.add(600);
		
		Object obj[]=new Object[v1.size()];
		v1.copyInto(obj);
		
		for(int i=0;i<obj.length;i++)
		{
			System.out.println(obj[i]);
		}
		
		Vector v2=new Vector();
		v2.add(10);
		v2.add(20);
		System.out.println(v2);
		System.out.println(v2.size());
		System.out.println(v2.capacity());
		v2.trimToSize();
		System.out.println(v2.size());
		System.out.println(v2.capacity());
//		v2.add(30);
//		v2.add(49);
//		v2.add(56);
//		System.out.println(v2.size());
//		System.out.println(v2.capacity());
		
		v2.ensureCapacity(6);
		v2.setSize(8);
		System.out.println(v2.size());
		System.out.println(v2.capacity());
		System.out.println(v2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
