import java.util.Stack;

public class Stack1 
{
	public static void main(String[] args) 
	{
		Stack s1=new Stack();
		s1.add(10);
		s1.add(20);
		s1.add(30);
		s1.add(20);
		System.out.println(s1);
		s1.pop();
		System.out.println(s1);
		System.out.println(s1.peek());
		System.out.println(s1);
		System.out.println(s1.search(20));
	}
}
