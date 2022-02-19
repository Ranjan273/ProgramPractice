package practice;

public class methodPrac {
	
	int myMethod() {
		System.out.println("I m in my method");
		
		return myMethod();
	}

	public static void main(String[] args) {
		
		methodPrac mP=new methodPrac();
		mP.myMethod();

	}

}
