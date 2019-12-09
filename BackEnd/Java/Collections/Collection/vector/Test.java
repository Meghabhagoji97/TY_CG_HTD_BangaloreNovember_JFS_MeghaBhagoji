import java.util.ArrayList;

public class Test 
{
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		
		for (int i = 0; i < a.length; i++) 
		{
			System.out.println(a[i]);
		}
		
		for(int i: a)
		{
			System.out.println(i);
		}
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(2);
		al.add(3);


		for (Integer integer : al) {
			System.out.println(integer);
		}
	}
}
