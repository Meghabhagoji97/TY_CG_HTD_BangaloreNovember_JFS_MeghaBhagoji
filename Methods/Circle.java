class Circle
{
	
		static double areaCircle(int r)
		{
			double areaCircle=3.142 * r * r;
			return areaCircle;
		}
		static double periCircle(int r)
		{
			double periCircle= 2*3.142*r;
			return periCircle;
		}

public static void main(String args[])
	{
		double area=areaCircle(6);
		System.out.println("result is "+area);
		
		double peri= periCircle(7);
		System.out.println("result is "+peri);
	}
}

		