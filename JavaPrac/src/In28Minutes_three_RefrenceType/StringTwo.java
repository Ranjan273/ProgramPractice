package In28Minutes_three_RefrenceType;

public class StringTwo {

	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer("Test");
		sb.append("123");
		System.out.println(sb);
		
		sb.setCharAt(0, 't');
		System.out.println(sb);
		

	}

}
