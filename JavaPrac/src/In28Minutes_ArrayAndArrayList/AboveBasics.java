package In28Minutes_ArrayAndArrayList;

import java.util.Arrays;

public class AboveBasics {

	public static void main(String[] args) {
		
		/*
		 * int[] marks= {100,89,97,95,91,99,92};
		 * 
		 * for(int mark : marks) { System.out.println(mark); }
		 */
		/*
		 * int[] marks=new int[100]; System.out.println(Arrays.toString(marks));
		 * 
		 * Arrays.fill(marks, 99); System.out.println(Arrays.toString(marks));
		 */
		
		/*
		 * int[] array1= {1,2,3}; int[] array2= {1,2,3};
		 */
		int[] array3= {3,2,1};
		
		/*
		 * boolean b=Arrays.equals(array1, array2); boolean b1=Arrays.equals(array1,
		 * array3);
		 * 
		 * System.out.println(b); System.out.println(b1);
		 */
		Arrays.sort(array3);
		System.out.println(Arrays.toString(array3));

	}

}
