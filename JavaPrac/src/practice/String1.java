package practice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class String1 {

	public static void main(String[] args) {

         String s="i am jyotiranja pradhan";
         char[] c=s.toCharArray();
         boolean success = true;
         
         for(char i='a';i<='z';++i) {
        	 if(!s.contains(String.valueOf(i))) {
        		 success=false;
        		
        	 }
         }
         if (success) {
        	 System.out.println("String contain all alphabet");
        	 
         }
         else {
        	 System.out.println("String contain no match");
         }
         
        	
         

	}

}
