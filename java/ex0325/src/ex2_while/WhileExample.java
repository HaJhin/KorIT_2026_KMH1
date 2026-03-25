package ex2_while;

import java.util.Scanner;

public class WhileExample {
	public static void main(String[] args) {
		/*
		int rand = (int)(Math.random()*6)+1;
		Scanner sc = new Scanner(System.in);
		int answer = 0;
		
		while (answer != rand) {
			System.out.print("정답 : ");
			answer = sc.nextInt();
			if (answer == rand) {
				System.out.println("정답입니다. 수 : " + rand);
			}
		} // while ed */
		
		/*
		int i = 1;
		int num = 0;
		while (i <= 100) {
			num += i;
			i++;
		}
		System.out.println(num); */
		
		// 키보드에서 정수를 하나 입력받아서, 각 자리의 합을 더한 결과를 출력하기
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int total = 0;
		while (num>0) {	
			total += num%10;
			num = num/10;
		}
		System.out.println(total);
	} // main ed
}
