import java.util.LinkedList;

public class LinkedList2 
{
	public static void main(String[] args) 
	{
		LinkedList l2=new LinkedList();
		l2.add(12);
		l2.add(45);
		l2.add(56);
		l2.add(67);
		l2.add(45);
		System.out.println(l2);
		System.out.println("-------------------------");
		
		l2.addFirst(100);
		l2.addLast(200);
		System.out.println(l2);
		System.out.println("-----------------get first and get last-------------");
		
		System.out.println(l2.getFirst());
		System.out.println(l2.getLast());
		System.out.println("------------remove first and remove last---------------");
		
		
		l2.remove();
		System.out.println(l2);
		l2.removeFirst();
		System.out.println(l2);
		l2.removeLast();
		System.out.println(l2);
		
		System.out.println("---------remove first occurance and last occurance-----------------");
		
		l2.removeFirstOccurrence(45);
		System.out.println(l2);
		l2.removeLastOccurrence(45);
		System.out.println(l2);
	}
}
