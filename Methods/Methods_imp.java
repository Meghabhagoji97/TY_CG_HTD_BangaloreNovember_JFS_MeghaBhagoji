class Methods_imp
{

	static void add(int a, int b)
	{
		System.out.println("sum is"+(a+b));
	}
	
	static void sub(int x, int y)
	{
		System.out.println("sub is"+(x-y));
	}
	
	static void mul(int c, int d)
	{
		System.out.println("mul is"+(c*d));
	}
	static void div(int m, int n)
	{
		System.out.println("div is"+(m/n));
	}
	static void mod(int a,int b)
	{
		System.out.println("mod is"+(a%b));
	}
public static void main(String args[])
	
	{
		add(10,20);
		sub(10,20);
		mul(10,20);
		div(10,20);
		mod(10,20);
	}

}