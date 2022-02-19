package practice;

import java.util.Arrays;

public class testArray {

	public static void main(String[] args) {
		int a[]={31,47,59,61};
	     
	for(int i=0;i<a.length;i++){
	     a[i]=a[i]%10;
          
	  }
	 System.out.println(Arrays.toString(a));
	   

	}

}
