package util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateCalenderMain {

	public static void main(String[] args) throws Exception {
			
		/*
		 * 
		 */
		long currentTime = System.currentTimeMillis();
		System.out.println(currentTime);
		
		long starTime = System.currentTimeMillis();
		
//		Thread.sleep(300);
		long endTime =System.currentTimeMillis();
		
		long duration = endTime - starTime;
//		System.out.println(duration);
		
		
		/*
		 * java.util.Date
		 */
		
		Date now = new Date();
		
		String nowString = now.toString();
		
		System.out.println(nowString);
		
		long currentTimeMillis1 = now.getTime();
		System.out.println("Date.getTime(): " +currentTimeMillis1);
		
		
		System.out.println();
		
		
		 
		System.out.println("--------Date > > String --------");
		/*
		 * format 쓰면 데이터를 스트링으로
		 * parse 스트링 > 데이터로
		 */
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy년 MM월 dd일");
		String s1 = sdf1.format(now);	
		System.out.println(s1);
		
		
		sdf1.applyPattern("yyyy/MM/dd HH:mm:ss.SSS");
		String s2 = sdf1.format(now);
		System.out.println(s2);
		
		sdf1.applyPattern("yyyy");
		String s3 = sdf1.format(now);
		System.out.println(s3);
	
		int a = Integer.parseInt(s3);
		System.out.println(a);
		
		
		SimpleDateFormat sdf2 = new SimpleDateFormat();
		sdf2.applyPattern("yyyy-MM-dd");
		Date birth = sdf2.parse("2000-05-03");
		System.out.println(birth.toString());
		
		
		System.out.println(now.getYear());
		
		sdf2.applyPattern("yyyy/MM/dd HH:mm:ss");
		Date yourBirthday = sdf2.parse("1994/06/16 28:16:46");
		System.out.println(yourBirthday);
		
		/*********java.util.calander**********/
		Calendar cal1 =Calendar.getInstance();
//		System.out.println(cal1);
		System.out.println(cal1.getCalendarType());
		
		long currentTimeMillis3= cal1.getTimeInMillis();
		System.out.println(currentTimeMillis3);
		
		int year = cal1.get(Calendar.YEAR);
		int month = cal1.get(Calendar.MONTH);
		int day= cal1.get(Calendar.DAY_OF_MONTH);
		int hour = cal1.get(Calendar.HOUR);
		System.out.println(hour);
		
		
		
		System.out.println("-----Calendar >> Date");
		Calendar cal2 = Calendar.getInstance();
		cal2.set(2021, Calendar.JANUARY, 10 ,13, 15,50);
		Date date2  =cal2.getTime();
		System.out.println(date2);
		
		
		
		System.out.println("----- Date>>>>>>Calendar");
		Date date3 = new Date();
		Calendar cal3 = Calendar.getInstance();
		cal3.setTimeInMillis(date3.getTime());
		System.out.println("date3 :" +date3.toLocaleString());
		System.out.println("Calendar : " + cal3);
		
		Date date4= new SimpleDateFormat("yyyy-MM-dd").parse("2022-01-10");
		Date date5= new SimpleDateFormat("yyyy-MM-dd").parse("2022-01-10");
		Date date6= new SimpleDateFormat("yyyy-MM-dd").parse("2022-01-15");
		
		System.out.println("equals : " +date4.equals(date5));
		System.out.println("equals : " +date6.equals(date5));
		System.out.println(date4.compareTo(date5));
		System.out.println(date6.compareTo(date4));
		
		long gapMilliSec = date6.getTime() - date4.getTime();
		System.out.println(gapMilliSec);
		
		
		
		
	
		
		
		
		
		 
		
		
		
		
	}

}
