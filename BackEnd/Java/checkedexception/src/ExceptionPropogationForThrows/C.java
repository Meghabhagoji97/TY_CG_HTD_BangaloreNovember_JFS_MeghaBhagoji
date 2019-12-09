package ExceptionPropogationForThrows;

public class C {
	static void n() throws ClassNotFoundException 
	{
		System.out.println("n() method called");
		D.o();
		System.out.println("n()  ended");
	}
}
