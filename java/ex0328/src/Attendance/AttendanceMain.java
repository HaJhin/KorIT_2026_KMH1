package Attendance;

import java.util.Calendar;

public class AttendanceMain {
	public static void main(String[] args) {
		AttendanceManager am = AttendanceManager.getInstace();
		
		System.out.println(am.getAttendance());
		am.addAttendance();
		System.out.println(am.getAttendance());
		
		// 싱글톤 패턴을 사용하는 이유
		// 공유 자원을 효율적으로 관리하고 구조를 안정적으로 유지하기 위해
		// 어디서든지 같은 객체를 가져올 수 있다.
		// 데이터를 일관성 있게 유지할 수 있다.
		// 실무에서 많이 쓰는 대표적인 사례
		
		// 1. DB 연결 관리자
		// 2. 로그 시스템 -> 하나의 객체로 기록
		// 설정(Config) -> 모든 곳에서 동일한 값을 가진다.
		
		Calendar cal = Calendar.getInstance();
	}
}
