package In28Minutes_ArrayAndArrayList;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;

public class Student {
	
	private String name;
	private  ArrayList<Integer> marks=new ArrayList<Integer>();

	public Student(String name, int... marks) {
		this.name=name;
		for(int mark : marks) {
			this.marks.add(mark);
		}
	}

	public  int getNumberofMarks() {
		int sum=0;
		for(int mark: marks) {
			sum+=mark;
		}
		return sum;
	}
	
	public  int getMaxofMarks() {
		return Collections.max(marks);
	}
	
	public  int getMinofMarks() {
		return Collections.min(marks);
	}
	
	/*
	 * public BigDecimal getavgmarks() { int sum=getNumberofMarks(); //int
	 * number=get }
	 */
	
	public String toString() {
		return name+ marks;
	}
	
	public void addmark(int mark) {
		marks.add(mark);
	}
	
	public void removemarkatIndex(int index) {
		marks.remove(index);
	}

}
