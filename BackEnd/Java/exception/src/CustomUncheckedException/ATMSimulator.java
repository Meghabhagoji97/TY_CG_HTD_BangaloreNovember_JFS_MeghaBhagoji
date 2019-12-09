package CustomUncheckedException;

public class ATMSimulator 
{

	void withdraw(double amt)
	{
		if(amt>40000)
		{
			throw new DatLimitException();
		}
	}
}
