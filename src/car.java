
public class car {
	
	private static car car_instance = null;
	
	public int llantas ;
	public int motor;
	
	private car() {
		llantas = 4;
		motor = 350;
		
		
		
	}
	
	public void setLlantas(int modificacion) {
		
		llantas -= modificacion;
	}
	
	public static car getInstance(){
		
		
		if(car_instance == null) {
			car_instance = new car();
		}
		return car_instance;
			
	}

}
