package ex4_for;

import java.util.Iterator;
import java.util.Scanner;

public class ForExample {
	public static void main(String[] args) {
		// 특정 영역 내에서 만들어진 변수는 해당 영역 내에서만 사용할 수 있다.
		// 안에서 만든 변수는 바깥에서 사용 불가
		// 바깥에서 만든 변수는 안에서 사용 가능
		
		for (int i = 1; i <= 3; i++) {	
			System.out.println("i의 값은 " + i);
		} // for ed
		
		for (int i = 5; i >= 1; i--) {	
			System.out.println(i);
		}
		for (int i = 1; i <= 20; i++) {
			if (i%2 != 0) System.out.println(i);
		}
		
		// 정수형 변수를 하나 초기화한다. 
		// 해당 정수에 해당하는 구구단 출력
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d x %d = %d\n",num,i,num*i);
		} // for ed
		
		
		// Scanner sc = new Scanner(System.in);
		// int num = sc.nextInt();
		int lastNum = 0;
		for (int i = 1; i <= num; i++) {	
			lastNum += i;
		}
		System.out.println(lastNum);
		
		
		//Scanner sc = new Scanner(System.in);
		int evan = 0;
		for(int i = 1; i <= 10; i++) {
			// int num = sc.nextInt();
			if (num%2 == 0) evan++;
		} // for ed
		System.out.println(evan);
		
	}
}
