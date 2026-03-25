package ex2_while;

import java.util.Scanner;

public class DowhileExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		System.out.println("메시지 입력");
		System.out.println("프로그램 종료 : Q");
		String inputString;
		do {
			System.out.print(">");
			inputString = sc.nextLine();
			System.out.println(inputString);
		} while (!inputString.equals("q")); */
		
		// 사용자가 비밀번호 입력
		/*
		int count = 5;
		int num = 0;
		do {
			System.out.print("비밀번호 입력 : ");
			int password = sc.nextInt();
			if (password == 1234) {	
				System.out.println("로그인 성공");
				num = 0;
			} else {
				num++;
				if (num != count) System.out.println("비밀번호 미일치");
				else System.out.println("접속 차단");
			}
		} while (num != count); */
		int sum = 0;
		int num = sc.nextInt();
		do {	
			sum += num%10;
			num = num/10;
			if (num>0) sum = sum*10;
		} while (num > 0);
		System.out.println(sum);
	}
}
