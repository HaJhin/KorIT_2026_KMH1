package ex1_exception.throwsexample;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Converter con = new Converter();
		Converter2 con2 = new Converter2();
		OrderService os = new OrderService();
	
		try {
			System.out.print("금액 입력 : ");
			String num = sc.next();
			System.out.print("개수 입력 : ");
			String num2 = sc.next();
			con2.toInt(num,num2);
		} catch (NumberFormatException e) {
			System.out.println("숫자 변환 불가능.");
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
}
