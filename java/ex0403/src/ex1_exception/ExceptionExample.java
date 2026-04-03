package ex1_exception;

import java.util.Scanner;

public class ExceptionExample {
	public static void main(String[] args) {
		// NullPointerExample
		// 참조변수에 null이 들어가있는데 값을 출력하려고 할때
		
		int[] array = null;
		//System.out.println(array[0]);
		
		// NumberFormatException
		// 잘못된 문자열을 숫자로 형변환하려고 할때 발생
		
		String str1 = "11.2";
		//int num = Integer.parseInt(str1);
		
		//ArrayIndexOutOfBoundsException
		// 배열에서 인덱스 범위를 초과해 사용할 때 발생
		
		int[] arr2 = new int[3];
		// System.out.println(arr2[4]);
		
		// ArithmeticException
		// 정수를 0으로 나누려고 할 때 발생한다.
		// System.out.println(10/0);
		
		// InputMismatchException
		// 입력 메서드와 입력한 값의 타입이 맞지 않을 떄
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		// int num2 = sc.nextInt();
		
	}
}
