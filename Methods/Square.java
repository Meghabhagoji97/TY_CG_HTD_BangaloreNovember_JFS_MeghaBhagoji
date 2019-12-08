class Square
{
	static int areaSquare(int s)
	{
		int areaSquare= s*s;
		return areaSquare;

	}
	static int periSquare(int s)
	{
		int periSquare=4*s;
		return periSquare;

	}


	public static void main(String args[])
	{
		int res=areaSquare(10);
		System.out.println("area is "+res);
		int res1=periSquare(20);
		System.out.println("peri is "+res1);


		}
}