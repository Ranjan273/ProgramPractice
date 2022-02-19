package practice;

public class StringPrac {

	public static void main(String[] args) {
		String s="12345";
		int sum=0;
		String num[]=s.split("");
		
		for(String n:num) {
			sum=sum+Integer.parseInt(n);		
			
		}
		System.out.println(sum);
		
	}
	
}
