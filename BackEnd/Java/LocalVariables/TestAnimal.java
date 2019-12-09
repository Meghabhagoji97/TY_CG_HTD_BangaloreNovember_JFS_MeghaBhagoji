package LocalVariables;

public class TestAnimal
{
	public static void main(String[] args) 
	{
		Lion l1=new Lion();
		l1.eat();
		
		Dog d=new Dog();
		d.eat();
		
		Animal a1=new Animal();
		a1.eat();
		
		Animal a2=new Lion();
		a2.eat();
	}
}
