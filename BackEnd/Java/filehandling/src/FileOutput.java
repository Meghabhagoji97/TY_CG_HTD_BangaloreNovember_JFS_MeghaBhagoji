import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileOutput 
{
	public static void main(String[] args)
	{
		try
		{
			FileOutputStream f1= new FileOutputStream("a.txt");
			String s1= "divya";
			
			byte[] b1= s1.getBytes();
			f1.write(b1);
			System.out.println("success....");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
