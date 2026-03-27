package ex2_method;

import java.util.Scanner;

public class CarculatorMain {
	public static void main(String[] args) {
		Carculator cal = new Carculator();
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수 : ");
		int x = sc.nextInt();
		System.out.print("두번째 정수 : ");
		int y = sc.nextInt();
		System.out.print("연산자 : ");
		String op = sc.next();
		System.out.println(cal.getResult(x, y, op));
	}
}
