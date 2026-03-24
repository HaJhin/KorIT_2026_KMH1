package ex2_if;

import java.util.Scanner;

public class RandomExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Math 클래스
		// random()메서드
		// 0.0 <= 1.0 사이의 double타입 난수를 하나 뽑아준다.
		// static 키워드가 붙어있으면 객체 생성없이 호출 가능
		//int num = (int)(Math.random()*6)+1; 
		// 어떤 주사위 눈이 나왔는지 확인하기
		// System.out.println("주사위 눈 : " + num);
		// 구매 금액에 따라 할인률이 적용된 금액 구하기
		// 10만원 이상 구매시 20% 할인
		// 5만원 이상 구매시 10% 할인
		double totalPrice = sc.nextInt();
		double disCount;
		System.out.println("구매 금액 : " + (int)totalPrice);
		if (totalPrice >= 100000) {
			disCount = totalPrice * 0.2;
			System.out.println("20% 할인 적용");
			System.out.println("최종금액 : " + (int)(totalPrice-disCount));
		} else if (totalPrice >= 50000) {
			disCount = totalPrice * 0.1;
			System.out.println("10% 할인 적용");
			System.out.println("최종금액 : " + (int)(totalPrice-disCount));
		} else {
			System.out.println("할인 미적용");
			System.out.println("최종금액 : " + (int)totalPrice);
		}
	}
}
