
public class mian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	car ford = car.getInstance();
	System.out.println(ford.llantas);
	car ford2 = car.getInstance();
	
	car ford3 = car.getInstance();
	
	ford.getInstance().setLlantas(2);
	
	
	System.out.println(ford.llantas);
	System.out.println(ford2.llantas);
	System.out.println(ford3.llantas);
	}
	


	
}
