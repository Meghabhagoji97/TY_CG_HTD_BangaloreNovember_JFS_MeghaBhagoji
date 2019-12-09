
public class TestA 
{
 public static void main(String[] args)
 {
	int i=10;
	System.out.println(i);
	//boxing
	Integer i1= new Integer(i);
	System.out.println(i1);
	
	//unboxing
	int i2=i1.intValue();
	System.out.println(i2);
	System.out.println("....................................");
	double d1=10.67;
	System.out.println(d1);
	//boxing
	
	Double d2= new Double(d1);
	System.out.println(d2);
	
	//unboxing
	double d3=d2.doubleValue();
	System.out.println(d3);
	
	}
}
