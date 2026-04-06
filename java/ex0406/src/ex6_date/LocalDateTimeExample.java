package ex6_date;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeExample {
	public static void main(String[] args) {
		// JAVA 8 이후에 등장한 현대적인 날짜 API
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		
		// 원하는 날짜와 시간을 직접 만들기
		LocalDateTime dateTime = LocalDateTime.of(2026,4,6,16,13,40);
		System.out.println(dateTime);
		
		// 낳짜와 시간 전체를 알고 있기 때문에 연도 월 일 등을 꺼낼 수 있다.
		System.out.println("연도 : " + now.getYear());
		System.out.println("월 : " + now.getMonthValue());
		System.out.println("일 : " + now.getDayOfMonth());
		System.out.println("시 : " + now.getHour());
		System.out.println("분 : " + now.getMinute());
		System.out.println("초 : " + now.getSecond());
		
		// 날짜와 시간 더하기 빼기
		// 일 더하기
		System.out.println("10일 뒤 : " + now.plusDays(10));
		// 월 더하기
		System.out.println("2달 뒤 : " + now.plusMonths(2));
		// 년 더하기 plusYears
			
		
		// 날짜 비교 기능
		// isbefore() : 앞선 시간인지 비교
		// isAfter() : 뒤의 시간인지 비교
		
		LocalDateTime meeting = LocalDateTime.of(2025,4,10,4,16);
		
		System.out.println(now.isBefore(meeting));
		System.out.println(now.isAfter(meeting));
		System.out.println(now.isEqual(meeting));
		
		// 날짜의 특정 부분만 바꾸기
		// 이미 만들어진 날짜/시간 객체에서
		// 연도나 월,일,시를 바꾼 새로운 객체 제작 가능
		LocalDateTime changed = now.withYear(2030)
				.withMonth(12)
				.withDayOfMonth(25)
				.withHour(9);
		System.out.println(now);
		System.out.println(changed);
		
		// 현재 시간이 09:00 ~ 18:00 사이인지 확인하여 예약 가능 여부 출력
		int hour = now.getHour();
		if (hour >= 9 && hour < 18) {
			System.out.println("예약 가능");
		} else System.out.println("예약 불가");
		
		LocalDateTime start = now.withHour(9).withMinute(0).withSecond(0);
		LocalDateTime end = now.withHour(18).withMinute(0).withSecond(0);
		
		
	}
}
