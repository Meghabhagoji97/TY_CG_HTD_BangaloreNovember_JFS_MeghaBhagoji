package LocalVariables;

public class Car extends Vehicle
{
	int cost=30000;
	
	void carDetails()
	{
		int cost=50000;
		System.out.println("the cost of local variable is"+cost);
		System.out.println("the cost of global variable is"+this.cost);
		System.out.println("the cost of super class variable is"+super.cost);
	}
}
