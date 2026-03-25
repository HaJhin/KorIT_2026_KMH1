package ex3_break;

import java.util.Iterator;
import java.util.Scanner;

public class BreakExample {
	public static void main(String[] args) {
		/*
		// 1~45 사이의 난수 뽑기
		int rand = (int)(Math.random()*45)+1;
		Scanner sc = new Scanner(System.in);
		int answer;
		for (int i = 1; i <= 10; i++) {
			
			System.out.print("숫자 : ");
			answer = sc.nextInt();
			if (answer == rand) {	
				System.out.println("정답입니다.");
				System.out.println("시도한 횟수 : " + i);
				break;
			} else if (answer > rand) {
				System.out.println("down!");
				
			} else if (answer < rand) {
				System.out.println("up!");
			}
			if (i == 10) {System.out.println("실패했습니다."); break;}
		} */
		
		// 라벨
		 outer:for(int i =1; i<=5; i++) {
			 for (int j = 1; j <=5; j++) {
				 System.out.println(i + " " + j);
				 if (j ==3) break outer;
			 }
		 }
	} // main ed
} // class ed
