package ex2_if;

import java.util.Scanner;

public class IfExample {
	public static void main(String[] args) {
		// 정수 하나를 입력받아 짝수면 짝수, 홀수면 홀수가 출력되게 만들기
		Scanner sc = new Scanner(System.in);
		/*
		int num = sc.nextInt();
		if (num%2 == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
		*/
		int password = sc.nextInt();
		if (password == 1234) {	
			System.out.println("로그인 성공");
		} else {
			System.out.println("비밀번호가 일치하지 않습니다.");
		}
	} // main ed
} // class ed

