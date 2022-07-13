package In28Minutes_One;

public class BookRunner {
	
	public static void main(String[] args) {
		
		Books artofprogramming=new Books();
		Books effectivejava=new Books();
		Books cleancode=new Books();
		
		artofprogramming.setNoofCopies(100);
		effectivejava.setNoofCopies(80);
		cleancode.setNoofCopies(45);
		
		cleancode.increaseCopies(30);
		int copies=cleancode.getNoofCopies();
		System.out.println(copies  );
	}

}
