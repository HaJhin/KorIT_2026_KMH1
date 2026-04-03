package app;

import java.util.Scanner;
import service.*;
import member.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 입력 : ");
		String name = sc.nextLine();
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		
		Member member = new Member(name, age);
		
		MeberService memberService = new MeberService();
		
		memberService.register(member);
		
		// 성인인지 확인하는 checkAdult() 메서드 만들기
		memberService.checkAdult(member);
	}
}
