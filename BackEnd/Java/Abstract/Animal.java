package Abstract;

abstract public class Animal
{
	//abstract method
	abstract void sound();
	
	int a;
	static double b =20.34;
	static int number;
	
	//constructor 
	 Animal(int number)
	 {
		 this.number=number;
		 System.out.println("Animal constructor is executing");
		 System.out.println(number);
	 }
	 // static method
	static
	{
		
		System.out.println("static block ");
	}
	//non static method 
	{
		a=456;
		System.out.println("non static block");
	}
	//concrete method
	void eat()
	{
		System.out.println("animal is eating");
	}
	
	
	
	
}
