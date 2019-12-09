package ExceptionPropogationForThrows;

public class B {
	static void m() throws ClassNotFoundException
	{
		System.out.println("m() started");
		C.n();
		System.out.println("m() ended");
	}
}
