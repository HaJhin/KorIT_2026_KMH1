package ex1_final;

import java.util.Scanner;

public class disCountRateMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int price = sc.nextInt();
		disCountRate dc = new disCountRate();
		System.out.println("최종금액 : " + dc.calculatePrice(price));
	}
}
