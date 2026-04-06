package ex7_regex;

import java.time.LocalDate;
import java.util.regex.Pattern;

public class PatternExample {
	public static void main(String[] args) {
		String regExp = "(02|010)-[0-9]{3,4}-[0-9]{4}";
		String data = "010-1234-5678";
		boolean result = Pattern.matches(regExp, data);
		
		//System.out.println(result);
		
		// 주민등록번호 정규식 만들기
		
		regExp = "[0-9]{6}-[0-9]{7}";
		String ssn = "001234-1234567";
		result = Pattern.matches(regExp, ssn);
		//System.out.println(result);
		
		String birth = ssn.substring(0,6);
		
		int year = Integer.parseInt("20"+birth.substring(0,2));
		//System.out.println("생일 : " + year);
		int month = Integer.parseInt(birth.substring(2,4));
		//System.out.println("월 : " + month);
		int day = Integer.parseInt(birth.substring(4,6));
		//System.out.println("일 : " + day);
		
		try {
			LocalDate.of(year,month,day);
		} catch (Exception e) {
			//System.out.println("잘못된 날짜");
		}
		
		// 숫자만 입력되었는지 검사
		// 문자열이 숫자로만 이루어져 있는지 검사하는 코드
		// "12345"
		String numsP = "\\d+";
		String nums = "1234";
		boolean result2 = Pattern.matches(numsP, nums);
		// System.out.println(result2);
		
		// 영어 소문자로 시작
		// 영어 소문자 + 숫자만 허용
		// 5~12자
		String regExp2 = "([a-z]|\\d){5,12}";
		String str2 = "12345";
		
		boolean result3 = Pattern.matches(regExp2, str2);
		
		System.out.println(result3);
		
		// 이메일 형식 검사
		// 아이디 부분 : 영문,숫자
		// 도메인 포함
		// 예시
		String emailPattern = "\\w+@\\w+\\.(com|net|ai)";
		String email = "a123@naver.com";
		
		System.out.println(email.matches(emailPattern));
	}
}
