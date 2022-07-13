package In28Minutes_ArrayAndArrayList;

public class StudentRunner {

	public static void main(String[] args) {

         int[] marks= {98,97,99,5};
         Student student=new Student("Ranjan",marks);
         
         int number=student.getNumberofMarks();
         System.out.println("Sum of marks :"+number);
         
         int maxmarks=student.getMaxofMarks();
         System.out.println("Max number of mark :"+maxmarks);
         
         int minmarks=student.getMinofMarks();
         System.out.println("Minimum number of mark :"+minmarks);
         
			/*
			 * int avgmark=student.getNumberofMarks();
			 * System.out.println("Avg number of marks :"+avgmark);
			 */
         
         System.out.println(student);
         
         student.addmark(66);
         System.out.println(student);
         
         student.removemarkatIndex(3);
         System.out.println(student);

	}

}
