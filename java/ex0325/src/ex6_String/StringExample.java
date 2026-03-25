package ex6_String;

import java.util.Arrays;
import java.util.Scanner;

public class StringExample {
	public static void main(String[] args) {
		// String
		// 문자들의 집합을 저장하는 객체 타입
		String s1 = "홍길동";
		String s2 = "홍길동";
		String s3 = new String("홍길동");
		String s4 = new String("홍길동");
		/*
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));
		System.out.println(System.identityHashCode(s4));
		
		// String은 클래스
		// 클래스 안에는 자주 사용하는 기능들이 메서드 형태로 정의되어있다.
		
		// 문자열에서 문자 추출하기
		// charAt(index);
		// index : 컴퓨터가 수를 세는 방식
		String subject = "123";
		char charValue = subject.charAt(2);
		System.out.println(charValue);
		
		String ssn = "9201231230123";
		char gender = ssn.charAt(6);
		if (gender == 1) System.out.println("남자");
		else System.out.println("여자");
		*/
		String subject = "자바 프로그래밍";
		String newStr = subject.replace("자바","JAVA");
		System.out.println(newStr);
		
		String str = "동해물과 백두산이 마르고 닳도록";
		System.out.println(str.substring(2,9));
		
		// 위치찾기
		// indexOf("문자열");
		int index = subject.indexOf("프로그");
		System.out.println(index);
		
		index = subject.indexOf("안녕하세요");
		System.out.println(index);
		
		// 문자열을 분리 
		// split("기준값");
		String board = "번호,제목,내용,성명";
		// 분리한 문자열을 배열로 반환
		String[] arr = board.split(",");
		System.out.println(Arrays.toString(arr));
		
		// 키보드에서 알파벳을 무작위로 입력받는다.
		// 입력받은 문자열에서 소문자 a가 몇 개 있는지 판별하는 코드 작성하기
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		String[] arr2 = word.split("");
		System.out.println(Arrays.toString(arr2));
		int totala = 0;
		for (int i = 0; i < arr2.length; i++) {
			if (arr2[i].toString().equals("a")) totala++;
			System.out.println(arr2[i].toString());
		}
		System.out.println(arr2.length);
		System.out.println(totala);
		
		
	}
}
