import java.util.LinkedList;

public class linkedlist3
{
	public static void main(String[] args) 
	{
		LinkedList l1=new LinkedList();
		l1.add(100);
		l1.add(200);
		l1.add(300);
		l1.add(400);
		System.out.println(l1);
		
		System.out.println("------------peek, peekfirst, peeklast-----");
		System.out.println(l1.peek());
		System.out.println(l1.peekFirst());
		System.out.println(l1.peekLast());
		
		System.out.println("-----poll, pollfirst,polllast---------");
		System.out.println(l1.poll());
		System.out.println(l1);
		System.out.println(l1.pollFirst());
		System.out.println(l1);
		System.out.println(l1.pollLast());
		System.out.println(l1);
		
		System.out.println("--------offer, offerfirst,offerlast------------");
		System.out.println(l1.offer(100));
		System.out.println(l1);
		System.out.println(l1.offerFirst(500));
		System.out.println(l1);
		System.out.println(l1.offerLast(600));
		System.out.println(l1);
		
		
		
	}
}
