package Abstract;

public class TestVehicle 
{
	public static void main(String[] args) {
		
	
	Car c1=new Car(1000);
	System.out.println(c1.cost);
	
	Vehicle v1=new Car(300);
	System.out.println(v1.cost);
}
}
