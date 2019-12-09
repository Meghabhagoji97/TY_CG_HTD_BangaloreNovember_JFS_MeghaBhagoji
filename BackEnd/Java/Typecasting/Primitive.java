package com.cgi.typecasting.pkg1;

public class Primitive 
{
	byte b=4;
	
	short s=b;
	int i=b;
	long l=b;
	float f=b;
	double d=b;
	
	double d1=34.56;
	int a=(int)d1;
	
	void Values()
	{
		System.out.println("value of byte is "+b);
		System.out.println("values of the short"+s);
		System.out.println("values of the int is"+i);
		System.out.println("values of the long is"+l);
		System.out.println("values of the float is"+f);
		System.out.println("values of the double is"+d);
		System.out.println("value is "+a);
	}
}
