package In28Minutes_three_RefrenceType;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class WrapperClassExp {

	public static void main(String[] args) {
		
		/*
		 * Integer hundred=Integer.valueOf("100"); System.out.println(hundred);
		 */
		
		/*
		 * Boolean value=Boolean.valueOf("True"); System.out.println(value);
		 */
		
		/*
		 * Float floatvalue=Float.valueOf(20.6f); System.out.println(floatvalue);
		 * 
		 * int floattoint=floatvalue.intValue(); System.out.println(floattoint);
		 * 
		 * double floattodouble=floatvalue.doubleValue();
		 * System.out.println(floattodouble);
		 */
		/*
		 * Double doublevalue=Double.valueOf(28.8987654876543456);
		 * System.out.println(doublevalue);
		 * 
		 * int doubletoint=doublevalue.intValue(); float
		 * doubletofloat=doublevalue.floatValue(); System.out.println(doubletoint);
		 * System.out.println(doubletofloat);
		 */
		
		/*
		 * Integer i1=new Integer(5); Integer i2=new Integer(5); Integer
		 * i3=Integer.valueOf(5); Integer i4=Integer.valueOf(5);
		 * System.out.println(i1==i2); System.out.println(i3==i4);
		 * System.out.println(i1==i4);
		 */
		
		/*
		 * Integer seven=7; Integer sevenagain=7; System.out.println(seven==sevenagain);
		 * 
		 * int max=Integer.MAX_VALUE; System.out.println(max);
		 * 
		 * int min=Integer.MIN_VALUE; System.out.println(min);
		 * 
		 * int size=Integer.SIZE; System.out.println(size);
		 * 
		 * int bytes=Integer.BYTES; System.out.println(bytes);
		 */
		
		/*
		 * LocalDate localdate=LocalDate.now(); System.out.println(localdate);
		 * 
		 * LocalDateTime ldt=LocalDateTime.now(); System.out.println(ldt);
		 * 
		 * LocalTime lt=LocalTime.now(); System.out.println(lt);
		 */
		
		/*
		 * LocalDate today=LocalDate.now(); System.out.println(today);
		 */
		
		/*
		 * System.out.println(today.getYear());
		 * System.out.println(today.getDayOfWeek()); System.out.println(today.getEra());
		 */
		
		/*
		 * System.out.println(today.isLeapYear());
		 * System.out.println(today.lengthOfMonth());
		 * System.out.println(today.lengthOfYear());
		 * 
		 * System.out.println(today.plusDays(100));
		 * System.out.println(today.plusMonths(100));
		 */
		/*
		 * LocalDate hundredYB=today.minusYears(100); System.out.println(hundredYB);
		 */
		
		LocalDate yesterday=LocalDate.of(2022, 06, 30);
		System.out.println(yesterday);
		
	}

}
