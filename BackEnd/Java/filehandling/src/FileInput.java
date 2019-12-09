import java.io.FileInputStream;

public class FileInput 
{
	public static void main(String[] args) 
	{
		try
		{
			FileInputStream f1= new FileInputStream("a.txt");
			int j=0;
			while((j=f1.read())!=-1)
			{
				System.out.print((char)j);
			}
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
