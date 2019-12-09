package CheckedExceptionpkg;

public class Employee implements Cloneable 
{
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
