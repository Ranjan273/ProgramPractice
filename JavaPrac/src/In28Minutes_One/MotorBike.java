package In28Minutes_One;

public class MotorBike {
	
	//State
	private int speed;//Member variable
	//input-int speed
	//output-void
	//name-setSpeed
	
	//Behaviour
	void start() {
		System.out.println("Bike started ");
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if(speed > 0)
		//System.out.println(speed);
		//System.out.println(this.speed);
		this.speed = speed;
		//System.out.println(this.speed);
	}
	
	public void increaseSpeed(int howmuch) {
		this.speed=this.speed+howmuch;
	}

}
