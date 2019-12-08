class Factorial
{
	static int factorialnum(int num)
	{
		if(num==0)
		{
		return 1;
		}
		return num*factorialnum(num-1);
	}	
	public static void main(String args[])
	{
		int fact=factorialnum(5);
		System.out.println(fact);
	}
}