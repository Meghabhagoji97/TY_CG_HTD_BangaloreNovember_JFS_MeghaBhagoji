package CustomUncheckedException;

public class DatLimitException extends RuntimeException
{
	String msg="day limit exceed";

//	public DatLimitException() {
//		super();
//	}

//	public DatLimitException(String msg) {
//		super();
//		this.msg = msg;
//	}
	
	public String getMessage()
	{
		return this.msg;
	}
	
}
