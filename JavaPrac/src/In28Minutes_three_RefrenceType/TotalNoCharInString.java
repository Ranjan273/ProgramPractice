package In28Minutes_three_RefrenceType;

public class TotalNoCharInString {

	public static void main(String[] args) {
		
		String str=" Ranjan ";
		String ustr=str.toLowerCase();
		System.out.println(ustr);
		String tstr=ustr.trim();
		System.out.println(tstr);
		
		int len=tstr.length();
		int count=0;
		for(int i=0;i<len;i++) {
			if(tstr.charAt(i)!=' ') {
				count++;
			}
		}
		
		System.out.println("No of character in the given string "+count);
		

	}

}
