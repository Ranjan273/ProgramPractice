package In28Minutes_One;

public class MotorBikeRunner {

	public static void main(String[] args) {
		
		MotorBike ducati=new MotorBike();
		MotorBike honda=new MotorBike();
		
		ducati.speed=100;
		honda.speed=80;
		
		ducati.start();
		honda.start();
	}

}
