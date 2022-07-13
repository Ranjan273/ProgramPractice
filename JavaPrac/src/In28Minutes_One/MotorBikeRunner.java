package In28Minutes_One;

public class MotorBikeRunner {

	public static void main(String[] args) {
		
		MotorBike ducati=new MotorBike();
		MotorBike honda=new MotorBike();
		
		ducati.setSpeed(100);
		//System.out.println(ducati.getSpeed());
		//honda.setSpeed(80);
		//System.out.println(honda.getSpeed());
		
		/*
		 * int ducatispeed=ducati.getSpeed(); System.out.println(ducatispeed);
		 * ducatispeed=ducatispeed+100; ducati.setSpeed(ducatispeed);
		 */
		ducati.increaseSpeed(100);
		System.out.println(ducati.getSpeed());
		
		
		
		ducati.start();
		honda.start();
	}

}
