package StaticNonStatic;

public class QspidersMain 
{
	public static void main(String args[])
	{
		Qspiders btm=new Qspiders();
		btm.swipe();
		btm.swipe();
		Qspiders hebbal= new Qspiders();
		hebbal.swipe();
		hebbal.swipe();
		
		System.out.println(btm.BranchCount);
		System.out.println(hebbal.BranchCount);
		System.out.println(Qspiders.TotalCount);
	}
}
