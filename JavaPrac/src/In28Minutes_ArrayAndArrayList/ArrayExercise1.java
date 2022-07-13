package In28Minutes_ArrayAndArrayList;

import java.util.Arrays;

public class ArrayExercise1 {

	public static void main(String[] args) {
		
		String[] days= {"Sunday","Monday","Tuesday","Wednesday","Thursday","friday","Satusday"};
		/*
		 * System.out.println(Arrays.toString(days));
		 * 
		 * System.out.println("-----Reverse days-----"); for(int j
		 * =days.length-1;j>=0;j--) { System.out.print(days[j]+" "); }
		 * 
		 * System.out.println("--------Sorted by length----------");
		 * 
		 * for(int i=0;i<days.length-1;i++) {
		 * 
		 * if(days[i].length()>days[i+1].length()) { String temp=days[i];
		 * days[i]=days[i+1]; days[i+1]=temp; } }
		 * 
		 * System.out.println(Arrays.toString(days));
		 * 
		 * System.out.println("------------------");
		 * 
		 * //System.out.println("Longest String is : "days[]);
		 */		
		String dayswithmostChar="";
		for(String day : days) {
			if(day.length()>dayswithmostChar.length()) {
				dayswithmostChar=day;
			}
		}
		System.out.println("Day with most number of character :"+dayswithmostChar);
		
		 for(int j =days.length-1;j>=0;j--) { 
			 System.out.print(days[j]+" ");
			 }
	}

}
