package java8features;
import java.time.LocalDate;
import java.time.LocalTime;
public class LocalDateExample {

	public static void main(String[] args) {
//		LocalDate date = LocalDate.now();
//		System.out.println(date);//2026-09-19
//		System.out.println(date.getDayOfWeek());//SATURDAY
//		System.out.println(date.getDayOfMonth());//19
//		System.out.println(date.getDayOfYear());//262
//		System.out.println(date.getMonthValue());//9
//		System.out.println(date.getYear());//2026
//		System.out.println(date.getMonth());//SEPTEMBER
		
		LocalTime time = LocalTime.now();
		System.out.println(time);//20:50:05.099459900
		 System.out.println(time.getHour());//20
	        System.out.println(time.getMinute());//58
	        System.out.println(time.getClass());//class java.time.LocalTime
	        System.out.println(time.getSecond());//16
	        System.out.println(time.getNano());//880070800

	}

}
