package practice;

import java.util.HashMap;

public class Dummy {

	public static void main(String[] args) {
		
		String s="happiest";
		HashMap<String,Integer> hm=new HashMap<>();
		String[] st=s.split("");
		for(String str :st) {
			
			if(hm.get(str)!=null) {
				hm.put(str, hm.get(str)+1);
			}
			else {
				hm.put(str, 1);
			}
			
		}
		System.out.println(hm);
		
        

	
	
	}
	
}
