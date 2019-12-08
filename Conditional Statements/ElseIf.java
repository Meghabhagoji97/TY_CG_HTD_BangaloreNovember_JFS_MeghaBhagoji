class ElseIf
{
	public static void main(String args[])

	{
		int a=10;
		int b=34;
		int c=45;
		int d=500;

		if(a > b && a > c && a > d)
		{
			System.out.println("a is greater");
		}
		else if (b > c && b > d)
		{
			System.out.println("b is greater");
		}
		else if(c > d)
		{
			System.out.println("c is greater");
		}
		else
		{
			System.out.println("d is greater");
		}




	}
}