package ex1_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exam {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		// 키보드에서 정수를 입력받고 정수 이외의 값이 입력되었다면
		// "정수만 입력 가능" 메시지 출력
		System.out.print("정수 입력 : ");
		try {
			int num = sc.nextInt();
			System.out.println(num);
		} catch (Exception e) {
			System.out.println("정수만 입력 가능 : " + e.toString());
		} // try catch ed
		*/
		
		String[] fruits = {"사과","바나나","포도","복숭아"};
		// 인덱스를 입력받고, 해당 인덱스의 과일 출력
		// 숫자가 아닌 값을 받을시 "숫자 입력"
		// 인덱스 범위 밖 입력 시 존재하지 않는 인덱스 출력
		System.out.print("정수 입력 : ");
		try {
			int num = sc.nextInt();
			System.out.println(fruits[num]);
		} catch (InputMismatchException e) {
			System.out.println("정수를 입력해주십시오");
		} catch (IndexOutOfBoundsException e) {
			System.out.println("인덱스 범위를 초과하였습니다.");
		}
	}
}
