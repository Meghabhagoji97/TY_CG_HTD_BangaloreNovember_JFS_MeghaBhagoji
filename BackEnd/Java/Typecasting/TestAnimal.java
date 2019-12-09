package com.cgi.typecasting.pkg1;

public class TestAnimal 
{
	public static void main(String[] args) 
	{
		Animal a1= new Dog();
		a1.eat();
		Dog d1=(Dog)a1;
		d1.eat();
		d1.walk();
		
		Animal a2= new Lion();
		Lion l1=(Lion)a2;
		l1.eat();
		l1.run();
	}
}
