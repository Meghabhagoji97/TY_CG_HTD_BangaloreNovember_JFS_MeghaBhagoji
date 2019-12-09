package Interface;

public interface Bottle
{
	// abstract method
	void open();
	
	void drink();
	
	//static methods
	static void close()
	{
		System.out.println("close the bottle");
	}
	
	//concrete methods
//	default void juice()
//	{
//		System.out.println("drink the juice");
//	}
}
