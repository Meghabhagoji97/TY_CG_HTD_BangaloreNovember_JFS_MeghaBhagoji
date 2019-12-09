import java.util.LinkedList;

public class Linkedlist4 
{
	public static void main(String[] args)
	{
		LinkedList l1=new LinkedList();
		
		l1.add(100);
		l1.add(290);
		l1.add(300);
		l1.push(345);
		System.out.println(l1);
		System.out.println(l1.pop());
		System.out.println(l1);
		l1.element();
		System.out.println(l1);
	}
}
