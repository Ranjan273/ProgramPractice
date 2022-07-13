package In28Minutes_OopsProgramAgain;

public class FanRunner {

	public static void main(String[] args) {
		Fan fan=new Fan("Manufacturer",0.3452,"Green");
		//fan.isOn(true);
		fan.switchOn();
		System.out.println(fan);
		fan.setSpeed((byte)3);
		System.out.println(fan);
		fan.switchOff();
		//fan.setSpeed((byte)1);
		System.out.println(fan);
	}

}
