package methodOverloading;



public class TestCalci
{
	public static void main(String[] args) 
	{
		Calculator c1=new Calculator();
		int res1= c1.add(10);
		System.out.println(res1);
		int res2=c1.add(10, 20);
		System.out.println(res2);
		
		Calculator.multiply(10);
		Calculator.multiply(10, 20);
		Calculator.multiply(12.2);
	}
}
