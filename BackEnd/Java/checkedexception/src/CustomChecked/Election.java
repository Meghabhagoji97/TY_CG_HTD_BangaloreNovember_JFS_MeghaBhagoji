package CustomChecked;

public class Election 
{
	void vote(int age) throws AgeLimitException
	{
		System.out.println("vote() method is called");
		if(age <18)
		{
			System.out.println("throw an expection to agelimit class");
			throw new AgeLimitException();
		}
		else
		{
			System.out.println("allowed for voting!!!");
		}
	}
}

